package com.PostalService.adapterPattern;

public class PostalConcrete implements OrderSingleItem {
	PostalAdapter postalAdapter;

	@Override
	public void orderName(String order) {

		if (order.equalsIgnoreCase("LETTER")) {
			System.out.println("Order of " + order + " is placed successfully");
		}

		else if (order.equalsIgnoreCase("TRANSRIPTS") || order.equalsIgnoreCase("ELECTRICITYBILL")) {
			postalAdapter = new PostalAdapter(order);
			postalAdapter.orderName(order);
		}

		else {
			System.out.println("Order " + order + " is not available");
		}
	}

}
