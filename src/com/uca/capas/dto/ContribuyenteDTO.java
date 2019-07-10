package com.uca.capas.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class ContribuyenteDTO {

	@NotEmpty(message="Nombre es requerido")
	@Size(message= "Supero el limite de caracteres", max=30)
	private String Nombre;
	
	@NotEmpty(message="Apellido es requerido")
	@Size(message="Supero el limite de caracteres", max=30)
	private String Apellido;
	
	@NotEmpty(message="Nit es requerido")
	@Size(message="Suepero el limite de caracteres", max=14)
	private String Nit;
	
	public Integer Importancia;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getNit() {
		return Nit;
	}

	public void setNit(String nit) {
		Nit = nit;
	}

	public Integer getImportancia() {
		return Importancia;
	}

	public void setImportancia(Integer importancia) {
		Importancia = importancia;
	}
	
}
