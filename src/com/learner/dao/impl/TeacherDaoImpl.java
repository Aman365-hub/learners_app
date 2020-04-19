package com.learner.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learner.dao.TeacherDao;

import com.learner.model.TeacherPojo;

public class TeacherDaoImpl implements TeacherDao{

	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());
			
	@Override
	public TeacherPojo createTeacher(TeacherPojo teacher) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(teacher);
		transaction.commit();
		session.close();
		return teacher;
	}

	@Override
	public TeacherPojo getTeachertId(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		TeacherPojo teacher=(TeacherPojo) session.get(TeacherPojo.class, id);
		transaction.commit();
		session.close();
		return teacher;
	}

	@Override
	public List<TeacherPojo> getAllTeacher() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<TeacherPojo> teacherList=session.createQuery("from com.learner.model.TeacherPojo").list();
		transaction.commit();
		session.close();
		return teacherList;
	}

	@Override
	public void removeTeacher(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		TeacherPojo t=new TeacherPojo();
		t.setTeacherId(id);
		session.delete(t);
		transaction.commit();
		session.close();
		
	}

	@Override
	public TeacherPojo updateTeacher(TeacherPojo teacher) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(teacher);
		transaction.commit();
		session.close();
		return teacher;
	}

	
	

}
