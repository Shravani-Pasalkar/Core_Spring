package com.jbk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jbk.entity.Country;
import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		
		Employee emp= context.getBean("kuchbhi",Employee.class);
		
		System.out.println(emp);
		
//		Country c= context.getBean("con",Country.class);
//		System.out.println(c);
		

	}

}
