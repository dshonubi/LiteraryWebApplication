package com.litageview.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Author {
	
	@Id
	@GeneratedValue
	@Column(name="AuthorId")
	private int authorId;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Mobile_Number")
	private int mobileNumber;
	
	@Column(name="Telephone_Number")
	private int telephoneNumber;
	
	@Column
	private boolean isOfAge;
	
	public Author(String firstName, String lastName, String email, int mobile, int telephone, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobile;
		this.telephoneNumber = telephone;
		this.setOfAge(age);
		
	}
	
	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public boolean isOfAge() {
		return isOfAge;
	}

	public void setOfAge(int age) {
		if((age>18) || (age<120)) {
			isOfAge = false;	
		}else{
			isOfAge = true;
		}
	}

}
