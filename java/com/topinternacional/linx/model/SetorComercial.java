package com.topinternacional.linx.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="G3_FORMATOS")
public class SetorComercial {
	
	@EmbeddedId
    private SetorComercialPK id;	
	
	@Column(name = "DES_FORMATO")
	private String desFormato;
	
	@Column(name = "DES_EDICAO")
	private String desEdicao;
	
	@Column(name = "SEQ_NIVEL_FAIXA")
	private String seqNivelFaixa;
	
	public SetorComercial() {}

	public SetorComercial(SetorComercialPK id, String desFormato, String desEdicao, String seqNivelFaixa) {
		super();
		this.id = id;
		this.desFormato = desFormato;
		this.desEdicao = desEdicao;
		this.seqNivelFaixa = seqNivelFaixa;
	}

	public long getCodFormato() {
		return id.getCodFormato();
	}
	
	public String getDesFormato() {
		return desFormato;
	}

	public void setDesFormato(String desFormato) {
		this.desFormato = desFormato;
	}	

}