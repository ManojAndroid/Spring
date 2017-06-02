package com.bridgelabz.SpringdiConstractor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
       HelpherClass class1=(HelpherClass) applicationContext.getBean("help");
       class1.GetDisplay();
    }
}
