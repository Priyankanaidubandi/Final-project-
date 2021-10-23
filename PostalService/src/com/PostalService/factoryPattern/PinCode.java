package com.PostalService.factoryPattern;

public class PinCode implements Delivery {

	@Override
	public void service() {
		System.out.println("Post to this PinCode is deliverable");
	}
}
