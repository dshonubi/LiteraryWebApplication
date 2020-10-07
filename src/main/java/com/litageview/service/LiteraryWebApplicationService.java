package com.litageview.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litageview.domain.Books;
import com.litageview.repository.LiteraryWebApplicationRepository;

@Service
public class LiteraryWebApplicationService {

	@Autowired
	private LiteraryWebApplicationRepository lwar;

	public void save(Books books) {
		lwar.save(books);
	}
	
	
	public Optional <Books> findByBookId(Integer id) {
		return lwar.findByBookId(id);
	}
	
	public Optional <Books> deleteByBookId(Integer id) {
		return lwar.deleteByBookId(id);
	}
	
	
	public void deleteById(int id){
		lwar.deleteById(id);;
	}

}
