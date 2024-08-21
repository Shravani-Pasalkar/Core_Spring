package com.jbk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.Scope;

import com.jbk.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		
		//use for @Bean annotation
		//Employee emp1 = context.getBean(Employee.class);// it give singleton object
		
		//Employee emp1 = context.getBean(Employee.class);// its give multiple object bcz we are use @Scope(value = "prototype") 
		
		//use for @componant annotation
		Employee emp= context.getBean("e_2", Employee.class);
		
		
		//System.out.println(emp1);
	     System.out.println(emp);
	}

}
