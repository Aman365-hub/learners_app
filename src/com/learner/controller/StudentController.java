package com.learner.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learner.model.StudentPojo;
import com.learner.service.StudentService;
import com.learner.service.impl.StudentServiceImpl;

@Path("/student")
public class StudentController {
	
	private StudentService service=new StudentServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public StudentPojo createStudent(StudentPojo student) {
		return service.createStudent(student) ;
	}

	@Path("/{id}")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public StudentPojo getStudentId(@PathParam("id")int id) {
				return service.getStudentId(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentPojo> studentAllStudent() {
		return service.getAllStudent();
	}

	@Path("/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeStudent(@PathParam("id")int id) {
		service.removeStudent(id);
		
	}


	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public StudentPojo updateStudent(StudentPojo student) {
	return service.updateStudent(student);
	}



}
