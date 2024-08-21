package com.jbk.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jbk.utility.Sim;

@Component
public class Person {

	
	int id;
	String name;
	
	
	@Autowired
	@Qualifier("airtel")
	Sim Sim1;
	
	@Autowired
	@Qualifier("jio")
	Sim Sim2;
	
	

	
	public Person() {
		
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public Sim getSim1() {
		return Sim1;
	}
	public void setSim1(Sim sim1) {
		this.Sim1 = sim1;
	}
	public Sim getSim2() {
		return Sim2;
	}
	public void setSim2(Sim sim2) {
		this.Sim2 = sim2;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
}
