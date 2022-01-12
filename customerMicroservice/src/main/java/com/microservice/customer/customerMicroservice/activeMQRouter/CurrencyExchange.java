package com.microservice.customer.customerMicroservice.activeMQRouter;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class CurrencyExchange {
	long id;
	String from;
	String to;
	BigDecimal conversionMultiple;
	public CurrencyExchange(long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	public CurrencyExchange() {
		super();
	}
	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + "]";
	}

}
