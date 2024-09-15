package com.andrew.gaming.app.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService 
{
	private DataService dataservice;
	
	public BusinessCalculationService(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}

	public int findMax()
	{
		return Arrays.stream(dataservice.retriveData()).max().orElse(0);
	}
}
