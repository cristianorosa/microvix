package com.topinternacional.linx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TOPV_LINX_LINHA")
public class Linha {
	
	@Id
	@Column(name = "CODIGO")
    private String codigo;	
	
	@Column(name = "NOME_LINHA")
	private String nomeLinha;
		
	public Linha() {}
	
	public Linha(String codigo, String nomeLinha) {
		super();
		this.codigo = codigo;
		this.nomeLinha = nomeLinha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNomeLinha() {
		return nomeLinha;
	}

	public void setNomeLinha(String nomeLinha) {
		this.nomeLinha = nomeLinha;
	}

	
}