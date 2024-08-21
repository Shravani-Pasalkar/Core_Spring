package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employe;



public class MainClass {

	public static void main(String[] args) {
		
		//class path
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		//object register
		
		
		//id what is menstion in xml file put in getbean (e1  )
		Employe emp= context.getBean("e1", Employe.class);
		System.out.println(emp);
		
		
		//add scope = "prototype" in xml for multiple instance
		Employe emp1= context.getBean("e1", Employe.class);
		System.out.println(emp1);

	}
}
