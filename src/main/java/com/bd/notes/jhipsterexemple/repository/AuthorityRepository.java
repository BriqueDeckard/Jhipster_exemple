package com.bd.notes.jhipsterexemple.repository;

import com.bd.notes.jhipsterexemple.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
