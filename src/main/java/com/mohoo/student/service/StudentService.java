/*
 * StudentService.java
 */
package com.mohoo.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.mohoo.student.mapper.StudentMapper;
import com.mohoo.student.model.Student;

/**
 * 学生管理服务类
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

@Service
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;

	public List<Student> listAllStudent(Student stu) {
		if (stu.getPage() != null && stu.getRows() != null) {
			PageHelper.startPage(stu.getPage(), stu.getRows());
		}
		return this.studentMapper.selectAll();
	}

	public Student getStudent(Integer id) {
		return this.studentMapper.selectByPrimaryKey(id);
	}

	public int deleteStudent(Integer id) {
		return this.studentMapper.deleteByPrimaryKey(id);
	}

	public int saveStudent(Student stu) {
		stu.setBirthday("2017-05-03");
		if (stu.getId() == null) {
			return this.studentMapper.insert(stu);
		} else {
			return this.studentMapper.updateByPrimaryKey(stu);
		}
	}
}
