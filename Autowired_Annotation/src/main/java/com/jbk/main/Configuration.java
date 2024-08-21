package com.jbk.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {"com.jbk"})
@PropertySource("classpath:myfile.properties")
public class Configuration {
	
	
	

}
