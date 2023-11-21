package com.AV_Somativa.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AV_Somativa.Repository.CursoRepository;
import com.AV_Somativa.entities.Curso;
@Service
public class CursoService {

	private final CursoRepository cursoRepository;

	@Autowired
	public CursoService(CursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}
	public List<Curso> buscaTodosCurso(){
		return cursoRepository.findAll();
	}
	public Curso buscaCursoId(Long id) {
		Optional <Curso> Curso = cursoRepository.findById(id);
		return Curso.orElse(null);
	}
	public Curso salvaCurso(Curso Curso) {
		return cursoRepository.save(Curso);
	}
	public Curso alterarCurso(Long id, Curso alterarC) {
		Optional <Curso> existeCurso = cursoRepository.findById(id);
		if(existeCurso.isPresent()) {
			alterarC.setId(id);
			return cursoRepository.save(alterarC);
		}
		return null;
	}
	public boolean apagarCurso(Long id) {
		Optional <Curso> existeCurso = cursoRepository.findById(id);
		if (existeCurso.isPresent()) {
			cursoRepository.deleteById(id);
			return true;
		}
		return false;
		}
}
