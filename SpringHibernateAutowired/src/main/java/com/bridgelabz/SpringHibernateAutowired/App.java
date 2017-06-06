package com.bridgelabz.SpringHibernateAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	/*@Autowired
	private static StudentDao studentDao;*/
	
	
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentModel studentModel = (StudentModel) context.getBean("studentModel");
		StudentDao studentDao=(StudentDao) context.getBean("studentDao");
		studentModel.setName("manojprasad singh");
		studentModel.setCity("ranchi");
		studentDao.save(studentModel);
		System.out.println(studentModel);
	}
}
