package com.example.demo.entities;
// Generated Jul 12, 2019 12:21:46 PM by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Docente generated by hbm2java
 */
@Entity
@Table(name = "docente", catalog = "cargaprojectbd")
public class Docente implements java.io.Serializable {

	private int idDocente;
	private String nombre;
	private String direccion;
	private Set<CargaAcademica> cargaAcademicas = new HashSet<CargaAcademica>(0);

	public Docente() {
	}

	public Docente(int idDocente, String nombre) {
		this.idDocente = idDocente;
		this.nombre = nombre;
	}

	public Docente(int idDocente, String nombre, String direccion, Set<CargaAcademica> cargaAcademicas) {
		this.idDocente = idDocente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.cargaAcademicas = cargaAcademicas;
	}

	@Id

	@Column(name = "id_docente", unique = true, nullable = false)
	public int getIdDocente() {
		return this.idDocente;
	}

	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}

	@Column(name = "nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "direccion", length = 50)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docente")
	public Set<CargaAcademica> getCargaAcademicas() {
		return this.cargaAcademicas;
	}

	public void setCargaAcademicas(Set<CargaAcademica> cargaAcademicas) {
		this.cargaAcademicas = cargaAcademicas;
	}

}