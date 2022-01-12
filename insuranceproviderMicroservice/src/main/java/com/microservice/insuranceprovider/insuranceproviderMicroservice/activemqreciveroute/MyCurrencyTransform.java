package com.microservice.insuranceprovider.insuranceproviderMicroservice.activemqreciveroute;

import org.springframework.stereotype.Component;

@Component
public class MyCurrencyTransform {

	public CurrencyExchange transformcurrency(CurrencyExchange currency) {
		currency.setFrom(Character.toString(currency.getFrom().charAt(0)));
		return currency;
	}
}
