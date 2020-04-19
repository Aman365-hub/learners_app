package com.learner.service;

import java.util.List;


import com.learner.model.TeacherPojo;

public interface TeacherService {
	
	public TeacherPojo createTeacher(TeacherPojo teacher);
	public TeacherPojo getTeacherId(int id);
	public List<TeacherPojo> getAllTeacher();
	public void removeTeacher(int id);
	public TeacherPojo updateTeacher(TeacherPojo teacher);

}
