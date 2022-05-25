package br.com.fiap.sprint1.sprint.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.sprint1.sprint.model.Caminhao;

public interface CaminhaoRepository extends JpaRepository<Caminhao, Long> {

}
