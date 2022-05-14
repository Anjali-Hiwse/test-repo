package com.example.springct.service;

import java.util.List;

import com.example.springct.domain.StudentEntity;

public interface StudentService {
	
	public void addStudent(String name,String email,String phone);
	
	public String printAllStudents();
	
	public void addStudentCourse(int course ,String name,String email,String phone);

}
