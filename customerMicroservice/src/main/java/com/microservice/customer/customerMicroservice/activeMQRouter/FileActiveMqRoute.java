package com.microservice.customer.customerMicroservice.activeMQRouter;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FileActiveMqRoute extends RouteBuilder {
	@Autowired
	CurrencyExchange cr;
	
	@Override
	public void configure() throws Exception {
		from("file:/home/venkateshwara/Desktop/files/json")
//		 .unmarshal().json(JsonLibrary.Jackson,CurrencyExchange.class)
		 //.log(cr.toString())
		.log("File sent to destination is ${body}")
		.to("activemq:ActiveMQ Json messages");
		
		from("file:/home/venkateshwara/Desktop/files/xml")
//		 .unmarshal().json(JsonLibrary.Jackson,CurrencyExchange.class)
		 //.log(cr.toString())
		.log("File sent to destination is ${body}")
		.to("activemq:ActiveMQ XMLmessages");
	}

}
