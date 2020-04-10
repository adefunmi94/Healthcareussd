package com.healthcareproject.ussd.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Table(name="hospital")
public class MumTribeHospital {
	
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
   
	@Column(name="hospital_name")
   private String[]  hospitalName;
	
	@Column(name="hospita-address")
	private HospitalAddress address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String[] hospitalName) {
		this.hospitalName = hospitalName;
	}

	public HospitalAddress getAddress() {
		return address;
	}

	public void setAddress(HospitalAddress address) {
		this.address = address;
	}
   

	
}
