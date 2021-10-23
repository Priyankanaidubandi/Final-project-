package com.PostalService.factoryPattern;

public class CityCode implements Delivery {
	@Override
	public void service() {
		System.out.println("Post to this city is deliverable");
	}
}
