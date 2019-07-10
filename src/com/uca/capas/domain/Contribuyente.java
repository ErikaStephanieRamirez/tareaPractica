package com.uca.capas.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="contribuyente")
public class Contribuyente {
	
	@Id
	@GeneratedValue(generator="contribuyente_c_contribuyente_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name= "contribuyente_c_contribuyente_seq", sequenceName="public.contribuyente_c_contribuyente_seq")
	@Column(name="c_contribuyente")
	private Integer c_contribuyente;
	
	@Column(name="s_nombre")
	private String nombre;
	
	@Column(name="s_apellido")
	private String apellido;
	
	@Column(name="s_nit")
	private String nit;
	
	@Column(name="f_fecha_ingreso")
	private Date fecha;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="c_importancia")
	private Importancia importancia;

	public String getfechaDelegate(){
		String Dte = null;
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Dte = format.format(this.fecha);
		return Dte;
	}
	
	public Integer getC_contribuyente() {
		return c_contribuyente;
	}

	public void setC_contribuyente(Integer c_contribuyente) {
		this.c_contribuyente = c_contribuyente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public Date getFecha_ingreso() {
		return fecha;
	}

	public void setFecha_ingreso(Date fecha) {
		this.fecha = fecha;
	}

	public Importancia getImportancia() {
		return importancia;
	}

	public void setImportancia(Importancia importancia) {
		this.importancia = importancia;
	}
}