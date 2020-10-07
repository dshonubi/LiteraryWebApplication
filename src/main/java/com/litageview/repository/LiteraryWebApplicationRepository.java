package com.litageview.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.litageview.domain.Books;

@Repository
public interface LiteraryWebApplicationRepository extends JpaRepository<Books, Integer> {

	Optional<Books> findByBookId(Integer id);

	Optional<Books> deleteByBookId(Integer id);

}