package com.microservice.customer.customerMicroservice.kafkarouter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
//@Component
public class KafkaRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:/home/venkateshwara/Desktop/files/json")
		.log("${body}")
		.to("kafka:kafkatopic_message");
	}

}
