package com.example.springct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.springct.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@DeleteMapping("delete/course/{id}")
	public HttpStatus deleteCourseById(@PathVariable(name="id") int id) {
		courseService.deleteCourse(id);
		return HttpStatus.OK;
	}

}
