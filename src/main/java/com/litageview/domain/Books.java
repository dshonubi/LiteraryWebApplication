package com.litageview.domain;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Books extends Author{
	
	@Column(name="BookId")
	private Integer bookId;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Genres")
	private ArrayList<String> genre = new ArrayList<String>();
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Upload_Date")
	private Date uploadDate;
	
	@Lob
	@Column(name="Book")
	private MultipartFile book;

	public Books(String firstName, String lastName, String email, int mobile, int telephone, int age, Integer bookId,
			String title, ArrayList<String> genre, String description, Date uploadDate, MultipartFile book) {
		super(firstName, lastName, email, mobile, telephone, age);
		this.bookId = bookId;
		this.title = title;
		this.genre = genre;
		this.description = description;
		this.uploadDate = uploadDate;
		this.book = book;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
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

	public MultipartFile getBook() {
		return book;
	}

	public void setBook(MultipartFile book) {
		this.book = book;
	}
	
}
