package br.com.romario.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.romario.domain.Pedido;
import br.com.romario.repositories.PedidoRepository;
import br.com.romario.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	public Pedido buscarPorId(Integer id) {
		Optional<Pedido> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Obejeto não encontrado! id: " + id + ", tipo" + Pedido.class.getName()));
	}
}
