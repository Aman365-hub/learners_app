package com.learner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class StudentPojo {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	
	public StudentPojo() {}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public StudentPojo(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "StudentPojo [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
	
	

	
}
