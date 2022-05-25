package br.com.fiap.sprint1.sprint.model.enums;

public enum TipoCaminhao {

	EixoSimples("Eixo Simples"),
	DoisEixos("Dois Eixos"),
	TresEixos("Tres Eixos"),
	Bitrem("Bitrem"),
	Rodotrem("Rodotrem");
	
	private String tipo;
	
	private TipoCaminhao(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
}
