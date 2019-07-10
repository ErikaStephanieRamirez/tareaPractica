package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Importancia;
import com.uca.capas.dto.ContribuyenteDTO;
import com.uca.capas.services.ContribuyenteService;
import com.uca.capas.services.ImportanciaService;


@Controller
public class MainController {
	
	@Autowired
	ImportanciaService servI;
	
	@Autowired
	ContribuyenteService servC;
	
	@RequestMapping("/")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		ContribuyenteDTO contri = new ContribuyenteDTO();
		mav.addObject("ContribuyenteDTO", contri);
		List<Importancia> imp = servI.findAll();
		mav.addObject("importancia", imp);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/Guardar", method=RequestMethod.POST)
	public ModelAndView guardar(@Valid @ModelAttribute("ContribuyenteDTO") ContribuyenteDTO ContribuyenteDTO, BindingResult result) {
		ModelAndView mav = new ModelAndView("redirect:/");
		
		if(result.hasErrors()) {
			List<Importancia> imp = servI.findAll();
			mav.addObject("importancia", imp);
			mav.setViewName("main");
		}
		else {
			servC.guardar(ContribuyenteDTO);
		}
		return mav;
	}
	
	@RequestMapping(value="/verTodos", method=RequestMethod.POST)
	public ModelAndView ver() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("contribuyentes", servC.findAll());
		mav.setViewName("ver");
		return mav;
	}
}
