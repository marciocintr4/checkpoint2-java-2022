package br.com.fiap.sprint1.sprint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trajeto {

	@Id
	@GeneratedValue
	private Long id;
	
	private int tempoMedioDirigidoEmMin;
	private int mediaPercorridaDiariaKm;
	
	@ManyToOne
	private Motorista motorista;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getTempoMedioDirigidoEmMin() {
		return tempoMedioDirigidoEmMin;
	}
	public void setTempoMedioDirigidoEmMin(int tempoMedioDirigidoEmMin) {
		this.tempoMedioDirigidoEmMin = tempoMedioDirigidoEmMin;
	}
	public int getMediaPercorridaDiariaKm() {
		return mediaPercorridaDiariaKm;
	}
	public void setMediaPercorridaDiariaKm(int mediaPercorridaDiariaKm) {
		this.mediaPercorridaDiariaKm = mediaPercorridaDiariaKm;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	
	
	
	
}
