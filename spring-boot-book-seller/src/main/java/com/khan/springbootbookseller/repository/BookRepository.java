package com.khan.springbootbookseller.repository;

import com.khan.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Long> {


}
