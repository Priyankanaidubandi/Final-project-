package com.PostalService.adapterPattern;

public class PickUp implements OrderMultipleItem {

	@Override
	public void orderItem1(String itemOrdered) {
	}

	@Override
	public void orderItem2(String itemOrdered) {
		System.out.println("Order " + itemOrdered + " pickedUp successfully.");
	}

}
