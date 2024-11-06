package br.com.romario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.romario.domain.Endereco;
import br.com.romario.domain.Produto;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
