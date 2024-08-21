package com.jbk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.entity.Country;
import com.jbk.entity.Employee;

public class MainClass {
	
	
	public static void main(String[] args) {
		
	ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
	
	 Employee emp = context.getBean(Employee.class);
	 System.out.println(emp);
	 
	 
	 Country con = context.getBean(Country.class);
	 System.out.println(con);
		
		
		
		
	}

}
