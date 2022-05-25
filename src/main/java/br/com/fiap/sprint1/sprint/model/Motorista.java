package br.com.fiap.sprint1.sprint.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Motorista {
	@Id
	@GeneratedValue
	private Long id;

	private int idade;
	private String nome;
	
	@OneToMany
	private List<Trajeto> trajetos;
	
	@ManyToMany
	private List<Caminhao> caminhoes;
	
	@OneToMany
	private List<Endereco> enderecos;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Trajeto> getTrajetos() {
		return trajetos;
	}

	public void setTrajetos(List<Trajeto> trajetos) {
		this.trajetos = trajetos;
	}

	public List<Caminhao> getCaminhoes() {
		return caminhoes;
	}

	public void setCaminhoes(List<Caminhao> caminhoes) {
		this.caminhoes = caminhoes;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	
	
}
