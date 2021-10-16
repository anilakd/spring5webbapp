package com.anilakdemir.spring5webbapp.repository;

import com.anilakdemir.spring5webbapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
