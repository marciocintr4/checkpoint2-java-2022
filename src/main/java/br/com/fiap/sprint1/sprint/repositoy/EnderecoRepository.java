package br.com.fiap.sprint1.sprint.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.sprint1.sprint.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
