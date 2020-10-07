package com.litageview.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Agents {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	private String firstName;
	private String lastName;
	private int mobileNumber;
	private int telephoneNumber;
	private String companyName;
	private String yearsAtCompany;
	private boolean verified;
	
	public Agents(String firstName, String lastName, int mobileNumber, int telephoneNumber, String companyName,
			String yearsAtCompany, boolean verified) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.telephoneNumber = telephoneNumber;
		this.companyName = companyName;
		this.yearsAtCompany = yearsAtCompany;
		this.verified = verified;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getYearsAtCompany() {
		return yearsAtCompany;
	}

	public void setYearsAtCompany(String yearsAtCompany) {
		this.yearsAtCompany = yearsAtCompany;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

}
