package com.lhprado.cursospring.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)//GET para obter dados, se fosse salvar, seria POST
	public String listar() {
		return "REST está funcionando Projeto funcionando";
	}
}