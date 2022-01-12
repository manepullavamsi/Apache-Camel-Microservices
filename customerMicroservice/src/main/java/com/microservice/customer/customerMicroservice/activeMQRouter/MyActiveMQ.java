package com.microservice.customer.customerMicroservice.activeMQRouter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
//@Component
public class MyActiveMQ extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:activeMQ?period=10000")
		.transform().constant("Venkat Message")
		.log("${body}")
		.to("activemq:ActiveMQ messages");
		
	}

}
