package com.senai.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Classe que é um controlador REST e atende pelo endPoint categorias
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	//Como é uma função REST precisa desta anotação
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST esta funcionando";
	}

}
