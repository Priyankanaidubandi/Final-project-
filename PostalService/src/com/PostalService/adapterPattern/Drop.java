package com.PostalService.adapterPattern;

public class Drop implements OrderMultipleItem {

	@Override
	public void orderItem1(String itemOrdered) {
		System.out.println("Order " + itemOrdered + " delivered successfully.");
	}

	@Override
	public void orderItem2(String itemOrdered) {

	}
}
