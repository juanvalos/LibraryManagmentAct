package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.model.Patron;

public interface PatronRepository extends JpaRepository<Patron, Long> {
}