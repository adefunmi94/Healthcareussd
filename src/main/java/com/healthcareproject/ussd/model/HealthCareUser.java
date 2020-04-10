package com.healthcareproject.ussd.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity(name="healthcare-app")
@Table(name="healthuser")
public class HealthCareUser {
	
	
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="pin")
	private String pin;
	
	@Column(name="last-name")
	private String lastName;
	
	@Column(name="first_name")
	private String firstNme;

	private List<MumTribeHospital> mumTribeHospital;
	
	public HealthCareUser() {
		super();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstNme() {
		return firstNme;
	}

	public void setFirstNme(String firstNme) {
		this.firstNme = firstNme;
	}


	public List<MumTribeHospital> getMumTribeHospital() {
		return mumTribeHospital;
	}


	public void setMumTribeHospital(List<MumTribeHospital> mumTribeHospital) {
		this.mumTribeHospital = mumTribeHospital;
	}
	
	
	
	

}
