package com.microservice.insuranceprovider.insuranceproviderMicroservice.restApi;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.insuranceprovider.insuranceproviderMicroservice.activemqreciveroute.CurrencyExchange;

@RestController
@RequestMapping
public class RestApi {
	
	@Autowired
	CurrencyExchange currency;
	
	@GetMapping("/currencyexchange/from/{from}/to/{to}")
	public CurrencyExchange getCurrencyExchange(@PathVariable String from, @PathVariable String to )
	{
		currency.setConversionMultiple(BigDecimal.valueOf(23.3));
		currency.setFrom(from);
		currency.setTo(to);
		currency.setId(777);
		return currency;
		
	}
	

}
