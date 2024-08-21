package com.jbk.network;


import org.springframework.stereotype.Component;

import com.jbk.utility.Sim;

@Component("artiel")
public class Airtel implements Sim{
	
	@Override
	public void calling () {
		
		System.out.println("u r called by Airtel network");
	}

}
