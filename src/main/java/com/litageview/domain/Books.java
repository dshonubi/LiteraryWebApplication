package com.litageview.domain;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Books {
	
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String author;
	private ArrayList<String> genre = new ArrayList<String>();
	private String description;
	private Date uploadDate;

	public Books(String title,String author,ArrayList<String> genre,String description,Date uploadDate) {
		
		this.title = title;
		this.author = author;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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
