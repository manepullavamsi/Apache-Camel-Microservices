package com.microservice.customer.customerMicroservice.simpleLanguage;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@Component
public class SimpleLanguage extends RouteBuilder{
	
	@Autowired
	DeciderBean deciderbean;
	//pipeline patteren
	//muliti cast pattern
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:/home/venkateshwara/Desktop/files/input")
		.choice()
		.when(simple("${file:ext} == 'xml' "))
			.to("file:/home/venkateshwara/Desktop/files/xml-files")
		.when(simple("${file:ext} == 'json' "))
			.to("file:/home/venkateshwara/Desktop/files/json-files")
		.when(method(deciderbean))
			.to("file:/home/venkateshwara/Desktop/files/unwanted-files")
		.otherwise()
			.log("None of conditions meet")
		.end()
		.to("direct:reuasble-route");
		
		
		
		from("direct:reuasble-route")//This route can be reusable throughout the application
		.log("${messageHistory}")
		.log("${file:name} ${file:ext} ${file:path}");
	}

}
