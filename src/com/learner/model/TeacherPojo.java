package com.learner.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class TeacherPojo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teacherId;
	private String teacherName;
	
	public TeacherPojo() {};
	

	@ManyToMany(fetch =FetchType.EAGER)
	private List<SubjectPojo> subject=new ArrayList<SubjectPojo> ();

	public int getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	public List<SubjectPojo> getSubject() {
		return subject;
	}


	public void setSubject(List<SubjectPojo> subject) {
		this.subject = subject;
	}


	public TeacherPojo(int teacherId, String teacherName, List<SubjectPojo> subject) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "TeacherPojo [teacherId=" + teacherId + ", teacherName=" + teacherName + ", subject=" + subject + "]";
	}
	
	

}
	
