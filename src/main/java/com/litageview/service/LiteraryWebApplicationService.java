package com.litageview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litageview.domain.Books;
import com.litageview.repository.LiteraryWebApplicationRepository;

@Service
public class LiteraryWebApplicationService {

	@Autowired
	LiteraryWebApplicationRepository lwar;

	public Books findByTitle(String title) {
		return lwar.findByTitle(title);
	}

	public void save(Books books) {
		lwar.save(books);
	}

}
