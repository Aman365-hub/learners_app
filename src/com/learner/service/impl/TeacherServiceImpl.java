package com.learner.service.impl;

import java.util.List;

import com.learner.dao.SubjectDao;
import com.learner.dao.TeacherDao;
import com.learner.dao.impl.SubjectDaoImpl;
import com.learner.dao.impl.TeacherDaoImpl;
import com.learner.model.TeacherPojo;
import com.learner.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	
	TeacherDao dao=new TeacherDaoImpl();


	@Override
	public TeacherPojo createTeacher(TeacherPojo teacher) {
		return dao.createTeacher(teacher);
	}

	@Override
	public TeacherPojo getTeacherId(int id) {
		return dao.getTeachertId(id);
	}

	@Override
	public List<TeacherPojo> getAllTeacher() {
		return dao.getAllTeacher();
	}

	@Override
	public void removeTeacher(int id) {
		 dao.removeTeacher(id);
		
	}

	@Override
	public TeacherPojo updateTeacher(TeacherPojo teacher) {
		return dao.updateTeacher(teacher);
	}

}
