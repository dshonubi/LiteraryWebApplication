package com.litageview.domain;

public class Agents {
	
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String telephoneNumber;
	private String companyName;
	private String yearsAtCompany;
	private boolean verified;

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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
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
