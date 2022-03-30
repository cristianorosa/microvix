package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Imposto {
	
	private String vTotTrib;
	
	@XStreamAlias("ICMS")
	private Icms icms = new Icms();
	
	@XStreamAlias("PIS")
	private Pis pis = new Pis();
	
	@XStreamAlias("COFINS")
	private Cofins cofins = new Cofins();
	
	@XStreamAlias("IPI")
	private Ipi ipi = new Ipi();

	public Ipi getIpi() {
		return ipi;
	}
	public void setIpi(Ipi ipi) {
		this.ipi = ipi;
	}
	public String getvTotTrib() {
		return vTotTrib;
	}
	public void setvTotTrib(String vTotTrib) {
		this.vTotTrib = vTotTrib;
	}
	public Icms getIcms() {
		return icms;
	}
	public void setIcms(Icms icms) {
		this.icms = icms;
	}
	public Pis getPis() {
		return pis;
	}
	public void setPis(Pis pis) {
		this.pis = pis;
	}
	public Cofins getCofins() {
		return cofins;
	}
	public void setCofins(Cofins cofins) {
		this.cofins = cofins;
	}
}