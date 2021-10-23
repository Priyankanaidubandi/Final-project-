package com.PostalService.factoryPattern;

public class StateCode implements Delivery {
	@Override
	public void service() {
		System.out.println("Post to this State is deliverable");
	}
}
