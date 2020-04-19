package com.learner.dao;

import java.util.List;

import com.learner.model.SubjectPojo;

public interface SubjectDao {
	
	public SubjectPojo createSubject(SubjectPojo subject);
	public SubjectPojo getSubjectId(int id);
	public List<SubjectPojo> getAllSubject();
	public void removeSubject(int id);
	public SubjectPojo updateSubject(SubjectPojo subject);
	

	
	

}
