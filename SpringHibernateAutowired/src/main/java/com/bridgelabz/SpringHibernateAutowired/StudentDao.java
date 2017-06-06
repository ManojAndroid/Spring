package com.bridgelabz.SpringHibernateAutowired;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	/*@Autowired
	StudentModel model;*/
	@Autowired
	private SessionFactory sessionFactory;

	public void save(StudentModel model) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(model);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
