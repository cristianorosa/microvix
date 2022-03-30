package com.topinternacional.linx.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SetorComercialPK implements Serializable {
		
	private static final long serialVersionUID = 6263899874991532879L;

	@Column(name = "COD_MASCARA")
	private long codMascara;
	
	@Column(name = "COD_FORMATO")	
	private long codFormato;
	
	public SetorComercialPK() {}
	
	public SetorComercialPK(long codMascara, long codFormato) {
		super();
		this.codMascara = codMascara;
		this.codFormato = codFormato;
	}

	public long getCodMascara() {
		return codMascara;
	}

	public void setCodMascara(long codMascara) {
		this.codMascara = codMascara;
	}

	public long getCodFormato() {
		return codFormato;
	}

	public void setCodFormato(long codFormato) {
		this.codFormato = codFormato;
	}
	
	
}



