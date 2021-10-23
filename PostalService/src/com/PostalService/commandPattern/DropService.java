package com.PostalService.commandPattern;

public class DropService implements Order {
	private DeliverStock order;

	public DropService(DeliverStock order) {
		this.order = order;
	}

	@Override
	public void search() {
		order.drop();
	}
}
