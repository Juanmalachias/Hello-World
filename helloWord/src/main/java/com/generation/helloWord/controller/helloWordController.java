package com.generation.helloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class helloWordController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("bsms")
	public String BSMs() {
		return "EE-PW - Trajetórias"
	           +"\nResponsabilidade pessoal"
	           +"\norientação ao futuro"
	           +"\nHabilidades Comportamentais e Mentalidades"
	           +"\nComunicação"
	           +"\nOrientação ao Detalhe"
	           +"\nProatividade"
	           +"\nOrientação ao Detalhe"
	           +"\nTrabalho em Equipe";
	}
	
	@GetMapping("Objetivos")
	public String Obj() {
		return "Fazer até a parte 7 do blogPessoal"
				+"\nConversa com meu grupo do projeto integrador"
				+"\nRealizar os execicios";
	}
	
}
   