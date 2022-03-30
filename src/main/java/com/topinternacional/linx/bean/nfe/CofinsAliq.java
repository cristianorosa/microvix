package com.topinternacional.linx.bean.nfe;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class CofinsAliq {

	@XStreamAlias("CST")
	private String cst;
	@XStreamAlias("vBC")
	private String vbc;
	@XStreamAlias("pCOFINS")
	private String pconfins;
	@XStreamAlias("vCOFINS")
	private String vcofins;
	
	
	public String getCst() {
		return cst;
	}
	public void setCst(String cst) {
		this.cst = cst;
	}
	public String getVbc() {
		return vbc;
	}
	public void setVbc(String vbc) {
		this.vbc = vbc;
	}
	public String getPconfins() {
		return pconfins;
	}
	public void setPconfins(String pconfins) {
		this.pconfins = pconfins;
	}
	public String getVcofins() {
		return vcofins;
	}
	public void setVcofins(String vcofins) {
		this.vcofins = vcofins;
	}
	
	
	
}
