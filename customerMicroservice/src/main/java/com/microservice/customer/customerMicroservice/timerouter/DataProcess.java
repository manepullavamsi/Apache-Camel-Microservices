package com.microservice.customer.customerMicroservice.timerouter;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DataProcess {

	public String transform(String s)
	{
		return s.toUpperCase().substring(2, 5);
	}
	
	private Logger log4=LoggerFactory.getLogger(DataProcess.class);
	public void process(String str)
	{
	log4.info(str+" From Data process");	
	}
	
	
}
