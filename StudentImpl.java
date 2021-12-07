package com.greatlearning.springMVC.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.springMVC.entity.Students;


@Service
public class StudentImpl implements Studentservice{

	private SessionFactory sessionFactory;
	  private Session session;
	  
	  @Autowired
	  public  StudentImpl(SessionFactory sessionFactory) {
		  this.sessionFactory = sessionFactory;
		  try {
			  session = sessionFactory.getCurrentSession();
		  }catch(HibernateException ex) {
			  session = sessionFactory.openSession();
		  }
	  }

	@Override
	
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		List<Students> students = session.createQuery("from Students").list();
		tx.commit();
		return students;
	}

	@Override
	
	public Students findById(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Students student = session.get(Students.class, id);
		tx.commit();	
		return student;
	}

	@Override
	@Transactional
	public void save(Students student) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(student);
		tx.commit();
		
		
	}

	@Override
	@Transactional
	public void deletedById(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Students student = session.get(Students.class, id);
		session.delete(student);
		tx.commit();
		
	}
   
	

  
	

}
