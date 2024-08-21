package com.jbk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.jbk.config.Configuration;
import com.jbk.entity.Person;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context  = new AnnotationConfigApplicationContext(Person.class);
		
		
		Person p =context.getBean(Person.class);
		
		
		p.getSim1().calling();
		
		p.getSim2().calling();
		
		
		//System.out.println(p);
	}

}
