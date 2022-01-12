package com.microservice.insuranceprovider.insuranceproviderMicroservice.activemqreciveroute;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MyActiveMqReciver extends RouteBuilder{
	@Autowired
	CurrencyExchange ex;
	
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("activemq:ActiveMQ Json messages")
		//.unmarshal().jacksonxml(CurrencyExchange.class)
		.unmarshal().json(JsonLibrary.Jackson,CurrencyExchange.class)
		.bean(MyCurrencyTransform.class,"transformcurrency")
		.bean(MyCurrencyProcess.class,"processCurency")
		.to("log:recived messages "+ex.getFrom());
		
		
		
		from("activemq:ActiveMQ XMLmessages")
		.unmarshal().jacksonxml(CurrencyExchange.class)
//		.unmarshal().jacksonxml(CurrencyExchange.class)
		//.unmarshal().json(JsonLibrary.Jackson,CurrencyExchange.class)
		.bean(MyCurrencyTransform.class,"transformcurrency")
		.bean(MyCurrencyProcess.class,"processCurency")
		.to("log:recived messages "+ex.getFrom());
		
	}

}
