package com.PostalService.factoryPattern;

public class CheckAvalibility {
	public Delivery checkDeliverable(String code) {
		if (code == null) {
			return null;
		}
		if (code.equalsIgnoreCase("TELANGANA")) {
			return new StateCode();

		} else if (code.equalsIgnoreCase("HYDERABAD")) {
			return new CityCode();

		} else if (code.equalsIgnoreCase("245125")) {
			return new PinCode();
		}
		return null;
	}
}
