package com.PostalService.factoryPattern;

public class PostalServiceFactoryMain {

	public static void main(String[] args) {
		CheckAvalibility check = new CheckAvalibility();
		Delivery check1 = check.checkDeliverable("TELANGANA");
		check1.service();
		Delivery check2 = check.checkDeliverable("HYDERABAD");
		check2.service();
		Delivery check3 = check.checkDeliverable("245125");
		check3.service();
	}

}
