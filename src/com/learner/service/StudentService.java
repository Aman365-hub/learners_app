package com.learner.service;

import java.util.List;

import com.learner.model.StudentPojo;



public interface StudentService {
	public StudentPojo createStudent(StudentPojo student);
	public StudentPojo getStudentId(int id);
	public List<StudentPojo> getAllStudent();
	public void removeStudent(int id);
	public StudentPojo updateStudent(StudentPojo student);
}


