package com.khan.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String city;

	private String pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
