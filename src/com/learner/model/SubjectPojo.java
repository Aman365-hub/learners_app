package com.learner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class SubjectPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subjectId;
	private String subjectName;
	
	
	public SubjectPojo() {}


	public int getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}


	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	public SubjectPojo(int subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}


	@Override
	public String toString() {
		return "SubjectPojo [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}
	
	
	
	

}
