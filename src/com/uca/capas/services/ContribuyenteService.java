package com.uca.capas.services;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.dto.ContribuyenteDTO;

public interface ContribuyenteService {
	
	public List<Contribuyente> findAll() throws DataAccessException;
	
	public void guardar(ContribuyenteDTO contr) throws DataAccessException;
}
