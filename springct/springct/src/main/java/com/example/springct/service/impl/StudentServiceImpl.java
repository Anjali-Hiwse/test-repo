package com.example.springct.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springct.domain.StudentEntity;
import com.example.springct.repository.StudentRepository;
import com.example.springct.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repository ;

	@Override
	public void addStudent(String name, String email, String phone) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setName(name);
		studentEntity.setEmail(email);
		studentEntity.setPhone(phone);
		repository.save(studentEntity);
	}

	@Override
	public String printAllStudents() {
		List<StudentEntity> list = repository.findAll();
		return list.toString();
	}

	@Override
	public void addStudentCourse(int course, String name, String email, String phone) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setName(name);
		studentEntity.setEmail(email);
		studentEntity.setPhone(phone);
		studentEntity.setCourse_id(course);
		repository.save(studentEntity);
		
	}

}
