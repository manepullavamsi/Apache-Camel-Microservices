package com.microservice.customer.customerMicroservice.simpleLanguage;

import java.util.Map;

import org.apache.camel.Body;

import org.apache.camel.Headers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class DeciderBean {
	
	Logger lg=LoggerFactory.getLogger(DeciderBean.class);
	
	public boolean decide1(@Body String cex,@Headers Map<String,String> mp) {
		lg.info("Converter bean log:"+cex+"Headers Info"+mp);
		return true;
	}


}
