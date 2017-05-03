package com.mohoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 启动入口
 *
 */
@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "com.mohoo.student.mapper")
public class StudentApp {

	public static void main(String[] args) {
		SpringApplication.run(StudentApp.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "redirect:student";
	}
}
