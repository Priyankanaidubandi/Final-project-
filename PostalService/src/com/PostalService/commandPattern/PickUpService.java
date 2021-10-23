package com.PostalService.commandPattern;

public class PickUpService implements Order {
	private DeliverStock order;

	public PickUpService(DeliverStock order) {
		this.order = order;
	}

	@Override
	public void search() {
		order.pickUp();
	}
}
