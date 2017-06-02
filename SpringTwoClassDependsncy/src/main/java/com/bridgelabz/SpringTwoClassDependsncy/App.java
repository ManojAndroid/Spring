package com.bridgelabz.SpringTwoClassDependsncy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
                Details details= (Details) context.getBean("Details");
                System.out.println(details);
    }
}
