package com.bridgelabz.SpringHibernat;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDao {
	
private SessionFactory mysessionFactory;


public void setsessionFactory(SessionFactory sessionFactory)
{
	this.mysessionFactory=sessionFactory;
}

 public void save(StudentModel model)
 {
	 Session session =mysessionFactory.openSession();
	 Transaction transaction=session.beginTransaction();
	 session.save(model);
	 transaction.commit();
	 session.close();
	 mysessionFactory.close();
 }
}
