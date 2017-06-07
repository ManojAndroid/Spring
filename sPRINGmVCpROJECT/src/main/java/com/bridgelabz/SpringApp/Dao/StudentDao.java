package com.bridgelabz.SpringApp.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.SpringApp.Model.Student;

public class StudentDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public void save(Student student) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
