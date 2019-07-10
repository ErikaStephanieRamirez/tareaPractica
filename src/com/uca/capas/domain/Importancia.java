package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="importancia")
public class Importancia {

	@Id
	@GeneratedValue(generator="importancia_c_importancia_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="importancia_c_importancia_seq", sequenceName="public.importancia_c_importancia_seq")
	@Column(name="c_importancia")
	private Integer c_importancia;
	
	@Column(name = "s_importancia")
	private String importancia;
	
	@OneToMany(mappedBy="importancia", fetch=FetchType.EAGER)
	private List<Contribuyente> contribuyentes;

	public Integer getC_importancia() {
		return c_importancia;
	}

	public void setC_importancia(Integer c_importancia) {
		this.c_importancia = c_importancia;
	}

	public String getImportancia() {
		return importancia;
	}

	public void setImportancia(String importancia) {
		this.importancia = importancia;
	}

	public List<Contribuyente> getContribuyentes() {
		return contribuyentes;
	}

	public void setContribuyentes(List<Contribuyente> contribuyentes) {
		this.contribuyentes = contribuyentes;
	}
	
}
