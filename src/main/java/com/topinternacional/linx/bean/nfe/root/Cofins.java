package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.topinternacional.linx.bean.nfe.CofinsAliq;

public class Cofins {
	
	@XStreamAlias("COFINSAliq")
	private CofinsAliq cofinsAliq = new CofinsAliq();
	
	@XStreamAlias("COFINSOutr")
	private CofinsAliq cofinOutr = new CofinsAliq();
	
	@XStreamAlias("COFINSNT")
	private CofinsNt cofinsNT = new CofinsNt();

	public CofinsAliq getCofinsAliq() {
		return cofinsAliq;
	}
	public void setCofinsAliq(CofinsAliq cofinsAliq) {
		this.cofinsAliq = cofinsAliq;
	}
	public CofinsAliq getCofinOutr() {
		return cofinOutr;
	}
	public void setCofinOutr(CofinsAliq cofinOutr) {
		this.cofinOutr = cofinOutr;
	}
	public CofinsNt getCofinsNT() {
		return cofinsNT;
	}
	public void setCofinsNT(CofinsNt cofinsNT) {
		this.cofinsNT = cofinsNT;
	}
	
}


