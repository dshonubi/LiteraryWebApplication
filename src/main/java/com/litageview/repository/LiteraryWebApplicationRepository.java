package com.litageview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.litageview.domain.Books;

@Repository
public interface LiteraryWebApplicationRepository extends JpaRepository<Books, String> {
	Books findByTitle(String title);

}