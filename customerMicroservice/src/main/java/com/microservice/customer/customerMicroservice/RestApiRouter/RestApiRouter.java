package com.microservice.customer.customerMicroservice.RestApiRouter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.microservice.customer.customerMicroservice.activeMQRouter.CurrencyExchange;
//@Component
public class RestApiRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		restConfiguration().host("localhost").port(8081);
		from("timer:Rest-API?period=10000")
		.setHeader("from", ()->"INR")
		.setHeader("to",()->"USD")
		.to("rest:get:/currencyexchange/from/EUR/to/INR")
		.log("${body}")
		.bean(CurrencyExchange.class)
		.log("${body}")
		.to("file:/home/venkateshwara/Desktop/files/output")
		.log("${body}");
		

		
		
	}

}
