package com.romario.cursomc.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.romario.cursomc.domain.Categoria;
import com.romario.cursomc.services.CategoriaService;

@RestController	
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	
	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(value = "/{id}",method= RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Categoria obj = categoriaService.findById(id);
		return ResponseEntity.ok().body(obj);	
	}
}
