package com.andrew.gaming.app.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5};
	}

}
