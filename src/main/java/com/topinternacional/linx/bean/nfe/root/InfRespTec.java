package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class InfRespTec {
	
	@XStreamAlias("CNPJ")
	private String cnpj;
	private String xContato;
	private String email;
	private String fone;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getxContato() {
		return xContato;
	}
	public void setxContato(String xContato) {
		this.xContato = xContato;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
}
