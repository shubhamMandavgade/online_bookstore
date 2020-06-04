package com.project.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book , Long>{

}
