package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class PisNt {
	
	@XStreamAlias("CST")
	private String cst;

	public String getCst() {
		return cst;
	}
	public void setCst(String cst) {
		this.cst = cst;
	}

}
