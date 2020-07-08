package com.lhprado.cursospring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lhprado.cursospring.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {

	@RequestMapping(method=RequestMethod.GET)//GET para obter dados, se fosse salvar, seria POST
	public List<Categoria> listar() {
		
		//Instanciação dos objetos "obj e obj2" agora eles são do tipo Categoria(enxergar e acessar os atributos da classe categoria)
		Categoria obj = new Categoria(1, "Informática");
		Categoria obj2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>(); //Uma lista do tipo categoria foi criada para diferentes objetos poderem armazenar seus dados nos campos da categoria
		lista.add(obj);
		lista.add(obj2);
		
		return lista;
		
		
	}
}
