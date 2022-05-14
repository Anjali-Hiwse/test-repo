package com.example.springct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springct.repository.CourseRepository;
import com.example.springct.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository repCourseRepository;
	
	@Override
	public void deleteCourse(int id) {
		repCourseRepository.deleteById(id);
		
	}

}
