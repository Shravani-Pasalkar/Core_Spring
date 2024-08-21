package com.jbk.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {
	
	
	int cid;
	String cname;
	
	public Country() {
		
	}
	
	//This is construter level injection
	@Autowired
	public Country(@Value("India")    String cname) {
		super();
		this.cname = cname;
	}
	
	public int getCid() {
		return cid;
	}

	public void setCid( int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	
	public void setCname(   String cname) {
		this.cname = cname;
	}
	
	
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	

}
