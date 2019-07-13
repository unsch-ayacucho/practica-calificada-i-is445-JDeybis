package com.example.demo.dao;

import java.util.List;

import com.example.demo.entities.CargaAcademica;
import com.example.demo.entities.Curso;
import com.example.demo.entities.Docente;

public interface DocenteDAO {
	public List<Docente> listarDocente();
	public List<CargaAcademica> listarCarga();
	public List<Curso> listarCurso();
}
