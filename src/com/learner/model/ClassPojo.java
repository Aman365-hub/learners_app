package com.learner.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class ClassPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int classId;
	private String className;
	
	@OneToMany(fetch =FetchType.EAGER)
	private List<StudentPojo> student=new ArrayList<StudentPojo>();
	
	@ManyToMany(fetch =FetchType.EAGER)
	private List<SubjectPojo> subject=new ArrayList<SubjectPojo>();
	
	@OneToMany(fetch =FetchType.EAGER)
	private List<TeacherPojo> teacher=new ArrayList<TeacherPojo>();
	
	public ClassPojo() {}
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
	public List<StudentPojo> getStudent() {
		return student;
	}

	public void setStudent(List<StudentPojo> student) {
		this.student = student;
	}

	public List<SubjectPojo> getSubject() {
		return subject;
	}

	public void setSubject(List<SubjectPojo> subject) {
		this.subject = subject;
	}

	public List<TeacherPojo> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<TeacherPojo> teacher) {
		this.teacher = teacher;
	}

	public ClassPojo( String className, List<StudentPojo> student, List<SubjectPojo> subject,
			List<TeacherPojo> teacher) {
		super();
		
		this.className = className;
		this.student = student;
		this.subject = subject;
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "ClassPojo [classId=" + classId + ", className=" + className + ", student=" + student + ", subject="
				+ subject + ", teacher=" + teacher + "]";
	}

	

}
