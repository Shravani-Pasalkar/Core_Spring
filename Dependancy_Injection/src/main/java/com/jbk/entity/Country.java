package com.jbk.entity;

public class Country {
	
	public Country() {
		
	}
	
	public Country(String cname) {
		super();
		this.cname = cname;
	}


	int cid;
	String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	

	
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
	
	
	

}
