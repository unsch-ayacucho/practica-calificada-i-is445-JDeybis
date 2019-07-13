package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.CargaAcademica;
import com.example.demo.entities.Curso;
import com.example.demo.entities.Docente;

@Repository("docenteDAO")
public class DocenteDaoImpl implements DocenteDAO {

	
		@PersistenceContext
		private EntityManager entityManager;

		@Override
		public List<Docente> listarDocente() {
			// TODO Auto-generated method stub
			return (List<Docente>) entityManager.createQuery("select a from Docente a", Docente.class).getResultList();
		}

		@Override
		public List<CargaAcademica> listarCarga() {
			// TODO Auto-generated method stub
			return (List<CargaAcademica>) entityManager.createQuery("select new CargaAcademica(D.nombre as nombre,sum(CU.HSemanales) as horas, CA.semestre as semestre)" + 
					" from CargaAcademica CA" + 
					" inner join CA.curso CU" + 
					" inner join CA.docente D" + 
					" group by D.nombre").getResultList();
		}

		@Override
		public List<Curso> listarCurso() {
			// TODO Auto-generated method stub
			return (List<Curso>) entityManager.createQuery("select a from Curso a", Curso.class).getResultList();
		}
		
		
}
