package com.topinternacional.linx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.topinternacional.linx.model.UserRepository;
import com.topinternacional.linx.repository.LinhaRepository;
import com.topinternacional.linx.repository.SetorRepository;

@Controller
public class ProdutosController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SetorRepository setorRepository;
	
	@Autowired
	private LinhaRepository linhaRepository;
	
	@GetMapping("/produtos")
	public String produtos(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("listUsers", userRepository.findAll());
				
		model.addAttribute("listSetores", setorRepository.findAll());
		model.addAttribute("listLinhas", linhaRepository.findAll());
		return "produtos";
	}	

}