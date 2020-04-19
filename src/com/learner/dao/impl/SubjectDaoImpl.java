package com.learner.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learner.dao.SubjectDao;
import com.learner.model.SubjectPojo;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SubjectDaoImpl implements SubjectDao{
	
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());

	@Override
	public SubjectPojo createSubject(SubjectPojo subject) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(subject);
		transaction.commit();
		session.close();
		return subject;
	}

	@Override
	public SubjectPojo getSubjectId(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		SubjectPojo subject=(SubjectPojo) session.get(SubjectPojo.class, id);
		transaction.commit();
		session.close();
		return subject;
	}

	@Override
	public List<SubjectPojo> getAllSubject() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<SubjectPojo> subjectList=session.createQuery("from com.learner.model.SubjectPojo").list();
		transaction.commit();
		session.close();
		return subjectList;
	}

	@Override
	public void removeSubject(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		SubjectPojo s=new SubjectPojo();
		s.setSubjectId(id);
		session.delete(s);
		transaction.commit();
		session.close();
	}

	@Override
	public SubjectPojo updateSubject(SubjectPojo subject) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(subject);
		transaction.commit();
		session.close();
		return subject;
	}

	
	

}
