package com.microservice.customer.customerMicroservice.routes.pattern;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EipRoutePattern extends RouteBuilder {

	
	@Autowired
	DynamicRouter dr;
	@Override
	public void configure() throws Exception {
//		Multicast example
		
		
		//Enaable Tracing
		getContext().setTracing(true);
		
		//If any message fail to delvery then that message is said to be dead queu letter
		//errorHandler(deadLetterChannel("activemq:All failed meaaage queue"));
		
		//wiretap in order to provide
		
//		from("timer:multicast?period=10000")
//		.multicast()
//		.to("log:multicast1","log:multicast2","log:multicast3");

		// Content based routing

		// Splitter Integration Design Pattern

//		from("file:/home/venkateshwara/Desktop/files/input")
//		.unmarshal().csv()
//		.split(body())
//		.to("log:Splitter working");

//		from("file:/home/venkateshwara/Desktop/files/input").convertBodyTo(String.class).split(body(), ",")// split(method(usersplitmethod)
//				.to("log:Splitter working");
//		String routeslip = "direct:endpoint1 ,direct:endpoint2,direct:endpoint3";
//
//		from("timer:routesslip?period=10000").transform().constant("my message constant")
//				.routingSlip(simple(routeslip));
//
//		// Route Slip
		from("direct:endpoint1").to("{{for-endpoint1}}");
		from("direct:endpoint2").to("log:Endpoint2");
		from("direct:endpoint3").to("log:Endpoint3");
		
		
		
		
		//Dyanmic Routing
		
		from("timer:dynamicRouting?period={{timeperiod}}")
		.transform().constant("Hai This is Dynamic routing")
		.dynamicRouter(method(dr));
		
		
		
		
		

	}

}
