package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.topinternacional.linx.bean.nfe.PisAliq;

public class Pis {
	
	@XStreamAlias("PISAliq")
	private PisAliq pisAliq = new PisAliq();
	
	@XStreamAlias("PISOutr")
	private PisAliq pisOutr = new PisAliq();
	
	@XStreamAlias("PISNT")
	private PisNt pisNt = new PisNt();
	
	public PisAliq getPisAliq() {
		return pisAliq;
	}
	public void setPisAliq(PisAliq pisAliq) {
		this.pisAliq = pisAliq;
	}
	public PisAliq getPisOutr() {
		return pisOutr;
	}
	public void setPisOutr(PisAliq pisOutr) {
		this.pisOutr = pisOutr;
	}
	public PisNt getPisNt() {
		return pisNt;
	}
	public void setPisNt(PisNt pisNt) {
		this.pisNt = pisNt;
	} 
	
}


