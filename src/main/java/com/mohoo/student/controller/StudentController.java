/*
 * StudentController.java
 */
package com.mohoo.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.pagehelper.PageInfo;
import com.mohoo.student.model.Student;
import com.mohoo.student.service.StudentService;

/**
 * 学生管理类
 * <p>
 * 创建日期：2017年5月3日<br>
 * 修改历史：<br>
 * 修改日期：<br>
 * 修改作者：<br>
 * 修改内容：<br>
 * 
 * @author caonn
 * @version 1.0
 */
@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping
	public ModelAndView listAll(Student student) {
		ModelAndView result = new ModelAndView("student/index");
		List<Student> stulist = this.studentService.listAllStudent(student);
		result.addObject("pageInfo", new PageInfo<Student>(stulist));
		result.addObject("queryParam", student);
		result.addObject("page", student.getPage());
		result.addObject("rows", student.getRows());
		return result;
	}

	@RequestMapping(value = "/add")
	public ModelAndView add() {
		ModelAndView result = new ModelAndView("student/view");
		result.addObject("student", new Student());
		return result;
	}

	@RequestMapping(value = "/delete/{id}")
	public ModelAndView delete(@PathVariable Integer id, RedirectAttributes ra) {
		ModelAndView result = new ModelAndView("redirect:/student");
		this.studentService.deleteStudent(id);
		 ra.addFlashAttribute("msg", "删除成功!");
		return result;
	}

	@RequestMapping(value = "/view/{id}")
	public ModelAndView view(@PathVariable Integer id) {
		ModelAndView result = new ModelAndView("student/view");
		Student stu = this.studentService.getStudent(id);
		result.addObject("student", stu);
		return result;
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView save(Student student) {
		ModelAndView result = new ModelAndView("student/view");
		String msg = student.getId() == null ? "新增成功" : "更新成功";
		this.studentService.saveStudent(student);
		result.addObject("student", student);
		result.addObject("msg", msg);
		return result;
	}

}
