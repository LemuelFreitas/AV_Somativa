package com.AV_Somativa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AV_Somativa.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	
	// Nenhuma implementação é necessária. Spring Data JPA cuidará disso.
}