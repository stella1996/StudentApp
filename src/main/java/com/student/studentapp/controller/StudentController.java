package com.student.studentapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.studentapp.services.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public String save(@RequestParam("id") Integer id, @RequestParam("name") String name,
			@RequestParam("age") Integer age){

		return studentService.save(id, name, age);
	}
	
	@PostMapping("/update")
	public String update(@RequestParam("id") Integer id,@RequestParam("age") Integer age){

		return studentService.update(id,age);
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("id") Integer id){

		return studentService.delete(id);
	}

}
