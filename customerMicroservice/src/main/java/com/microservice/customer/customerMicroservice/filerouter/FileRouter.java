package com.microservice.customer.customerMicroservice.filerouter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
//@Component
public class FileRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:/home/venkateshwara/Desktop/files/input")
		.log("${body}")
		.to("file:/home/venkateshwara/Desktop/files/output");
	}

}
