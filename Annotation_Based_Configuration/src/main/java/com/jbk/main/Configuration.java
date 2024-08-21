package com.jbk.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;


import com.jbk.entity.Employee;


@ComponentScan(basePackages = {"com.jbk"})
public class Configuration {

	
//	@Bean
//	@Scope(value = "prototype") // scope (value = "prototype") is use for crate a multiple instance like == com.jbk.entity.Employee@4c402120 
	                                                                                                      //com.jbk.entity.Employee@4c402120
	///==> we can not use prototype then it give singleton object like == com.jbk.entity.Employee@4c402120
	
//	public Employee getEmployee() {
//		Employee e = new Employee();
//		return e;
//		
//	}
}
