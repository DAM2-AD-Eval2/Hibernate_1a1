package com.dam.DAMHibernate_1a1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Conductor {
	
	@Id
	private String dni;
	@Column
	private String nombre;
	@Column
	private String telefono;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DAMMatricula", foreignKey = @ForeignKey(name = "fk_coche"))
	private Coche coche;
	
	public Conductor(String dni, String nombre, String telefono, Coche coche) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.coche = coche;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

}
