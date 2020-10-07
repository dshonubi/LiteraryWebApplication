package com.litageview.domain;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Books extends Author{
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Genres")
	private ArrayList<String> genre = new ArrayList<String>();
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Upload_Date")
	private Date uploadDate;


	public Books(String firstName, String lastName, String email, int mobile, int telephone, int age, String title,
			ArrayList<String> genre, String description, Date uploadDate) {
		super(firstName, lastName, email, mobile, telephone, age);
		this.title = title;
		this.genre = genre;
		this.description = description;
		this.uploadDate = uploadDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<String> getGenre() {
		return genre;
	}

	public void setGenre(ArrayList<String> genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

}
