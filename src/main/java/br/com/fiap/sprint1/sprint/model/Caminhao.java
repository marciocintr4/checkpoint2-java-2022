package br.com.fiap.sprint1.sprint.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.fiap.sprint1.sprint.model.enums.TipoCaminhao;

@Entity
public class Caminhao {

	@Id
	@GeneratedValue
	private Long id;
	
	private Double taraMediaKg;
	private Double lotacaoMediaKg;
	
	@Enumerated(EnumType.STRING)
	private TipoCaminhao tipoCaminhao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getTaraMediaKg() {
		return taraMediaKg;
	}
	public void setTaraMediaKg(Double taraMediaKg) {
		this.taraMediaKg = taraMediaKg;
	}
	public Double getLotacaoMediaKg() {
		return lotacaoMediaKg;
	}
	public void setLotacaoMediaKg(Double lotacaoMediaKg) {
		this.lotacaoMediaKg = lotacaoMediaKg;
	}
	public TipoCaminhao getTipoCaminhao() {
		return tipoCaminhao;
	}
	public void setTipoCaminhao(TipoCaminhao tipoCaminhao) {
		this.tipoCaminhao = tipoCaminhao;
	}

}
