package com.student.studentapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentapp.model.Student;
import com.student.studentapp.repositories.StudentRepository;
@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public String save(Integer id, String name, Integer age) {
		// TODO Auto-generated method stub
		
		Student student= new Student();
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		studentRepo.save(student);
		return "home";
	}

	public String update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		
		studentRepo.update(id,age);
		return "home";
	}

	public String delete(Integer id) {
		// TODO Auto-generated method stub
		
		studentRepo.delete(id);
		return "home";	}

}
