package com.example.springct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springct.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add/student/{name}/{email}/{phone}")
	public HttpStatus addStudent(@PathVariable(name="name") String name,@PathVariable(name="email") String email,
			@PathVariable(name="phone") String phone) {
	    studentService.addStudent(name, email, phone);
		return HttpStatus.OK;
	}

	@GetMapping("/list/students")
	public HttpStatus listAllStudents() {
		String list = studentService.printAllStudents();
		return HttpStatus.OK;
		
	}
}
