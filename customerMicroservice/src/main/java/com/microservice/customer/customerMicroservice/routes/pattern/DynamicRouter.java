package com.microservice.customer.customerMicroservice.routes.pattern;

import org.springframework.stereotype.Component;

@Component
public class DynamicRouter {
	int n=1;
	public String provideRoute() {
		n++;
		if(n%2==0)
		return "direct:endpoint1";
		else if(n%2!=0)
			return "direct:endpoint1,direct:endpoint2";
		else
			return null;
	}
	

}
