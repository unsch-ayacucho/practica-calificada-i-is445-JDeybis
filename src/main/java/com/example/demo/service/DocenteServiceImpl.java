package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DocenteDAO;
import com.example.demo.entities.CargaAcademica;
import com.example.demo.entities.Curso;
import com.example.demo.entities.Docente;

@Service("docenteService")
@Transactional
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteDAO docenteDao;
	
	
	
	@Override
	public List<Docente> listarDocente() {
		// TODO Auto-generated method stub
		return docenteDao.listarDocente();
	}

	@Override
	public List<CargaAcademica> listarCarga() {
		// TODO Auto-generated method stub
		return docenteDao.listarCarga();
	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return docenteDao.listarCurso();
	}

}
