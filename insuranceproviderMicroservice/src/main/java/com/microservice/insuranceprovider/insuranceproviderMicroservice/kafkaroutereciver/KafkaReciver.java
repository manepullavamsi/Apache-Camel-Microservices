package com.microservice.insuranceprovider.insuranceproviderMicroservice.kafkaroutereciver;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
//@Component
public class KafkaReciver extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("kafka:kafkatopic_message")
		.to("log:Message Recived from Kafka");
	}

}
