package com.jbk.network;


import org.springframework.stereotype.Component;

import com.jbk.utility.Sim;

@Component("jio")
public class Jio implements Sim{
	
	@Override
	public void calling () {
		
		System.out.println("u r called by jio network");
	}


}
