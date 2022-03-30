package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class IPITrib {
	
	@XStreamAlias("CST")
	private String cst;
	@XStreamAlias("vBC")
	private String vBc;
	@XStreamAlias("pIpi")	
	private String pIPI;
	@XStreamAlias("vIpi")
	private String vIPI;
	
	public String getCst() {
		return cst;
	}
	public void setCst(String cst) {
		this.cst = cst;
	}
	public String getvBc() {
		return vBc;
	}
	public void setvBc(String vBc) {
		this.vBc = vBc;
	}
	public String getpIPI() {
		return pIPI;
	}
	public void setpIPI(String pIPI) {
		this.pIPI = pIPI;
	}
	public String getvIPI() {
		return vIPI;
	}
	public void setvIPI(String vIPI) {
		this.vIPI = vIPI;
	}

}

