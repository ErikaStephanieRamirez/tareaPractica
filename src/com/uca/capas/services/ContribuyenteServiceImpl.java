package com.uca.capas.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.dto.ContribuyenteDTO;
import com.uca.capas.repositories.ContribuyenteRepository;
import com.uca.capas.repositories.ImportanciaRepository;

@Service
public class ContribuyenteServiceImpl implements ContribuyenteService {
	
	@Autowired 
	ContribuyenteRepository c;
	 
	@Autowired 
	ImportanciaRepository i;
	
	@Override
	public List<Contribuyente> findAll() throws DataAccessException{
		return c.findAll();
	}

	@Override
	@Transactional
	public void guardar(ContribuyenteDTO contr) throws DataAccessException{
		Contribuyente co = new Contribuyente();
		
		co.setNombre(contr.getNombre());
		co.setApellido(contr.getApellido());
		co.setNit(contr.getNit());
		co.setImportancia(i.findOne(contr.getImportancia()));
		Date dat = new Date();
		co.setFecha_ingreso(new java.sql.Date(dat.getTime()));
		
		c.saveAndFlush(co);
	}
}
