package com.bridgelabz.SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

    	helpherclass output = (helpherclass)context.getBean("help");
        output.generateOutput();

    
    
    
    }   
    }

