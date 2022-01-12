package com.microservice.insuranceprovider.insuranceproviderMicroservice.activemqreciveroute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyCurrencyProcess {
	Logger logs=LoggerFactory.getLogger(MyCurrencyProcess.class);
	public void processCurency(CurrencyExchange ex)
	{
		logs.info(ex.toString());
		
		
	}



}
