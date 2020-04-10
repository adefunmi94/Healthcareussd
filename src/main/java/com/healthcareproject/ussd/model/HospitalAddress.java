package com.healthcareproject.ussd.model;

public class HospitalAddress {

	private String state;
	
	private String city;
	
	private String street;

	
	public HospitalAddress() {
		super();
	}

	public HospitalAddress(String state, String city, String street) {
		super();
		this.state = state;
		this.city = city;
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "HospitalAddress [state=" + state + ", city=" + city + ", street=" + street + "]";
	}
	
	
	
	
}
