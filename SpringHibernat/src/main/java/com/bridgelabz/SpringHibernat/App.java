package com.bridgelabz.SpringHibernat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao studentDao = (StudentDao) context.getBean("Studentdao");

		StudentModel studentModel = new StudentModel();
		studentModel.setName("vijay prasad singh");
		studentModel.setMobilenumber(77237190);
		studentModel.setAddress("Daltonganj");
		studentDao.save(studentModel);
		
		
		System.out.println(studentModel);
	}
}
