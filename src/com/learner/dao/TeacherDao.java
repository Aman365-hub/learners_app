package com.learner.dao;

import java.util.List;


import com.learner.model.TeacherPojo;

public interface TeacherDao {
	
	public TeacherPojo createTeacher(TeacherPojo teacher);
	public TeacherPojo getTeachertId(int id);
	public List<TeacherPojo> getAllTeacher();
	public void removeTeacher(int id);
	public TeacherPojo updateTeacher(TeacherPojo teacher);
	
	

}
