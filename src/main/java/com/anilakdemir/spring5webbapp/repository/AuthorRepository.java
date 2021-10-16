package com.anilakdemir.spring5webbapp.repository;

import com.anilakdemir.spring5webbapp.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
