package com.microservice.customer.customerMicroservice.timerouter;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomProcess implements Processor {

	Logger lo=LoggerFactory.getLogger(CustomProcess.class);
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		lo.error(exchange.getMessage().getMessageId().toString());
		
		
	}

}
