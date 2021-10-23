package com.PostalService.facadePattern;

public class CheckAvalibility {

	private Delivery stateDelivarable;
	private Delivery cityDelivarable;
	private Delivery pincodeDelivarable;

	public CheckAvalibility() {
		stateDelivarable = new StateCode();
		cityDelivarable = new CityCode();
		pincodeDelivarable = new PinCode();
	}

	public void checkStateDelivarable() {
		stateDelivarable.service();
	}

	public void checkCityDelivarable() {
		cityDelivarable.service();
	}

	public void checkPincodeDelivarable() {
		pincodeDelivarable.service();
	}
}
