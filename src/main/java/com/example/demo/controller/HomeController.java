package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.DocenteService;

@Controller
@RequestMapping("/admin")
public class HomeController {

	@Autowired
	private DocenteService docenteService;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("listarCarga", docenteService.listarCarga());
		
		return "views/home/index";
	}
	
	@GetMapping("/docente")
	public String docente(Model model) {
		
		model.addAttribute("listarDocente", docenteService.listarDocente());
		
		return "views/home/docente";
	}
	
	@GetMapping("/curso")
	public String curso(Model model) {
		
		model.addAttribute("listarCurso", docenteService.listarCurso());
		
		return "views/home/course";
	}
}
