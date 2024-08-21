package com.jbk.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	
	@Autowired
	@Value("${myid}")
	int id;
	
	
	@Value("${myname}")
	String name;
	
	@Autowired
	Country country;
	
	
	public Employee() {
		
	}
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	//This is satter level injection
	
	@Autowired
	public void setId( @Value("1") int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("Shravani")  String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	
	

	
}
