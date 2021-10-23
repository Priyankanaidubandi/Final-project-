package com.PostalService.facadePattern;

public class StateCode implements Delivery{
	@Override
	public void service() {
	   System.out.println("Post to this State is deliverable");
	}
}
