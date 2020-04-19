package com.learner.service.impl;

import java.util.List;

import com.learner.dao.SubjectDao;
import com.learner.dao.impl.SubjectDaoImpl;
import com.learner.model.SubjectPojo;
import com.learner.service.SubjectService;

public class SubjectServiceImpl implements SubjectService{
	
	SubjectDao dao=new SubjectDaoImpl();

	@Override
	public SubjectPojo createSubject(SubjectPojo subject) {
		
		return dao.createSubject(subject) ;
	}

	@Override
	public SubjectPojo getSubjectId(int id) {
		
		return dao.getSubjectId(id);
	}

	@Override
	public List<SubjectPojo> getAllSubject() {
	
		return dao.getAllSubject();
	}

	@Override
	public void removeSubject(int id) {
		 dao.removeSubject(id);
		
	}

	@Override
	public SubjectPojo updateSubject(SubjectPojo subject) {
	
		return dao.updateSubject(subject);
	}

	
	

	

	

}
