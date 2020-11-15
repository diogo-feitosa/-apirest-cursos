package com.cursos.apirest.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.apirest.models.Curso;
import com.cursos.apirest.repository.CursoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Cursos")
public class CursoController {
	
	@Autowired
	CursoRepository cursoRepository;
	
	@ApiOperation(value="Retorna uma lista de Cursos")
	@GetMapping("/cursos")
	public List<Curso> listaCursos(){
		return cursoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um curso unico")
	@GetMapping("/curso/{id}")
	public Curso listaCursoUnico(@PathVariable(value="id") long id){
		return cursoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um curso")
	@PostMapping("/curso")
	public Curso salvaCurso(@RequestBody  Curso curso) {
		return cursoRepository.save(curso);
	}
	
	@ApiOperation(value="Deleta um curso")
	@DeleteMapping("/curso")
	public void deletaCurso(@RequestBody  Curso curso) {
		cursoRepository.delete(curso);
	}
	
	@ApiOperation(value="Atualiza um curso")
	@PutMapping("/curso")
	public Curso atualizaCurso(@RequestBody  Curso curso) {
		return cursoRepository.save(curso);
	}
	 

}