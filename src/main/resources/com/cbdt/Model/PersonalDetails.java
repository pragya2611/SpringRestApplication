package com.cbdt.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PersonalDetails")
public class PersonalDetails {

	String firstName;
	String lastName;
	String address1;
	String address2;
	String city;
	String state;
	int pincode;
	String pan;
	Date dob;
	int income;
	int tds;
	int assesmenty;
	
	public String getFirstName() {
		return firstName;
	}
	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress1() {
		return address1;
	}
	@XmlElement
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	public String getAddress2() {
		return address2;
	}
	@XmlElement
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@XmlElement
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	@XmlElement
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String getPan() {
		return pan;
	}
	@XmlElement
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Date getDob() {
		return dob;
	}
	@XmlElement
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getIncome() {
		return income;
	}
	@XmlElement
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTds() {
		return tds;
	}
	@XmlElement
	public void setTds(int tds) {
		this.tds = tds;
	}
	public int getAssesmenty() {
		return assesmenty;
	}
	@XmlElement
	public void setAssesmenty(int assesmenty) {
		this.assesmenty = assesmenty;
	}
	
	
		
	}
	
	
	
	
}
	