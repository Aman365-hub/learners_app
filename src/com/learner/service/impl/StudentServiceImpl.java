package com.learner.service.impl;

import java.util.List;

import com.learner.dao.StudentDao;
import com.learner.dao.impl.StudentDaoImpl;
import com.learner.model.StudentPojo;
import com.learner.service.StudentService;

public class StudentServiceImpl implements StudentService {
	StudentDao dao=new StudentDaoImpl();

	@Override
	public StudentPojo createStudent(StudentPojo student) {
	 return dao.createStudent(student);
	}

	@Override
	public StudentPojo getStudentId(int id) {
		return dao.getStudentId(id);
	}

	@Override
	public List<StudentPojo> getAllStudent() {
		return dao.getAllStudent();
	}

	@Override
	public void removeStudent(int id) {
		dao.removeStudent(id);
		
	}

	@Override
	public StudentPojo updateStudent(StudentPojo student) {
		return dao.updateStudent(student);
	}

}
