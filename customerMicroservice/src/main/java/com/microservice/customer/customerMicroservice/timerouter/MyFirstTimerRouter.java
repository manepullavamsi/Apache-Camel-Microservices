package com.microservice.customer.customerMicroservice.timerouter;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@Component
public class MyFirstTimerRouter extends RouteBuilder{
	int count=3;
	
	@Autowired
	DataProcess dataobj;
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("timer:firstTimer?repeatCount=2")
		.transform().constant("Timer Venkateshwara ")
		.bean(dataobj, "process")
		.process(new CustomProcess())
		.log("${body}")
		.bean(dataobj,"transform")
		.process(new CustomProcess())
		.to("log:OmNamo Venkateshwara log");
		
//		from("url:https://reqres.in/api/products/3")
//		.bean(dataobj, "process")
//		.to("log:Testing API");
		
	}

	
	
}
