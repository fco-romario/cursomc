package br.com.romario.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.romario.domain.Categoria;
import br.com.romario.repositories.CategoriaRepository;
import br.com.romario.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository reposotory;
	
	public Categoria buscarPorId(Integer id) {
		Optional<Categoria> obj = reposotory.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object não encontrado! Id: " + id + ", tipo: " + Categoria.class.getName()));
	}
}
