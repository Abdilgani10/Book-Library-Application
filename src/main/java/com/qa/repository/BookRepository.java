package com.qa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.model.Books;

public interface BookRepository extends JpaRepository<Books, Long> {

}
