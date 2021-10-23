package com.PostalService.adapterPattern;

public class PostalAdapter implements OrderSingleItem {

	OrderMultipleItem multipleItem;

	public PostalAdapter(String order) {

		if (order.equalsIgnoreCase("TRANSRIPTS")) {
			multipleItem = new Drop();

		} else if (order.equalsIgnoreCase("ELECTRICITYBILL")) {
			multipleItem = new PickUp();
		}
	}

	public void orderName(String order) {
		if (order.equalsIgnoreCase("TRANSRIPTS")) {
			multipleItem.orderItem1(order);
		} else if (order.equalsIgnoreCase("ELECTRICITYBILL")) {
			multipleItem.orderItem2(order);
		}
	}
}
