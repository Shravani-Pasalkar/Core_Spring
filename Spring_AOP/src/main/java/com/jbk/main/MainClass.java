package com.jbk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.config.Config;
import com.jbk.entity.Account;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Account acc =context.getBean(Account.class);
		//System.out.println(acc);
		acc.deposit();
		acc.deposit1(6000);
		acc.withdraw();
		
	}

}
