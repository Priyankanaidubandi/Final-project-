package com.PostalService.commandPattern;

public class PostalStock {

	private String orderName1 = "ABC";

	public PostalStock(String orderName1) {
		super();
		this.orderName1 = orderName1;

	}

	public void drop() {
		System.out.println("Order [ Name: " + orderName1 + " ] droped successfully");
	}

	public void pickUp() {
		System.out.println("Order [ Name: " + orderName1 + " ] pickuped successfully");
	}

}
