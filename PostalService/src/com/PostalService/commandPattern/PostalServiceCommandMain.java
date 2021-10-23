package com.PostalService.commandPattern;

public class PostalServiceCommandMain {
	public static void main(String[] args) {
		PostalStock order1 = new PostalStock("LETTER");
		PostalStock order2 = new PostalStock("TRANSCRIPTS");

		DropService drop = new DropService(order1);
		PickUpService pickUp = new PickUpService(order2);
		
		ByPass byPass = new ByPass();
		byPass.takeOrder(drop);
		byPass.takeOrder(pickUp);
		
		byPass.placeOrders();
	}
}
