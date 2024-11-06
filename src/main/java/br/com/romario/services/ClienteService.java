package br.com.romario.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.romario.domain.Cliente;
import br.com.romario.repositories.ClienteRepository;
import br.com.romario.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public Cliente buscarPorId(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Obejeto não encontrado! id: " + id + ", tipo" + Cliente.class.getName()));
	}
}
