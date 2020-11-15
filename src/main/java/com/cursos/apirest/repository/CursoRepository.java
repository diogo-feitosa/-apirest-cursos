package com.cursos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.apirest.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	Curso findById(long id);
}
