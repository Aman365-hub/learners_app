package com.learner.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learner.dao.StudentDao;
import com.learner.model.StudentPojo;


public class StudentDaoImpl implements StudentDao {
	
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());

	@Override
	public StudentPojo createStudent(StudentPojo student) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
		return student;
	}

	@Override
	public StudentPojo getStudentId(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		StudentPojo student=(StudentPojo) session.get(StudentPojo.class, id);
		transaction.commit();
		session.close();
		return student;
	}

	@Override
	public List<StudentPojo> getAllStudent() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<StudentPojo> studentList=session.createQuery("from com.learner.model.StudentPojo").list();
		transaction.commit();
		session.close();
		return studentList;
	}

	@Override
	public void removeStudent(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		StudentPojo stu=new StudentPojo();
		stu.setStudentId(id);
		session.delete(stu);
		transaction.commit();
		session.close();
		
	}

	@Override
	public StudentPojo updateStudent(StudentPojo student) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(student);
		transaction.commit();
		session.close();
		return student;
	}

}
