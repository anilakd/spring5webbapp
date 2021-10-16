package com.anilakdemir.spring5webbapp.repository;

import com.anilakdemir.spring5webbapp.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
