package com.litageview.domain;

public class Author {

	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String telephoneNumber;
	private boolean isOfAge;

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

	public boolean isOfAge() {
		return isOfAge;
	}

	public void setOfAge(boolean isOfAge) {
		this.isOfAge = isOfAge;
	}

}
