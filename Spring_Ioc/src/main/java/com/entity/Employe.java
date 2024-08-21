package com.entity;

public class Employe {
	

	int id;
	String name;
	String mobileno;
	
	
	public Employe(){
		
	}

	
	public Employe(String name, String mobileno) {
		super();
		this.name = name;
		this.mobileno = mobileno;
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



	public String getMobileno() {
		return mobileno;
	}



	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}



	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", mobileno=" + mobileno + "]";
	}
	
	
	
	
}
