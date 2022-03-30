package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("IPINT")
public class IpiNt {

	@XStreamAlias("CST")
	private String cst;

	public String getCst() {
		return cst;
	}
	public void setCst(String cst) {
		this.cst = cst;
	}

}