package com.PostalService.facadePattern;

public class PostalServiceFacadeMain {

	public static void main(String[] args) {
		CheckAvalibility avalibility = new CheckAvalibility();

		avalibility.checkStateDelivarable();
		avalibility.checkCityDelivarable();
		avalibility.checkPincodeDelivarable();
	}

}
