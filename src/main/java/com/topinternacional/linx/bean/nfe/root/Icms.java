package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.topinternacional.linx.bean.nfe.IcmsAliq;

public class Icms {
	
	@XStreamAlias("ICMS00")
	private IcmsAliq icm00 = new IcmsAliq();
	
	@XStreamAlias("ICMS60")
	private IcmsAliq icm60 = new IcmsAliq(); 
	
	@XStreamAlias("ICMS20")
	private IcmsAliq icm20 = new IcmsAliq();

	public IcmsAliq getIcm00() {
		return icm00;
	}
	public void setIcm00(IcmsAliq icm00) {
		this.icm00 = icm00;
	}
	public IcmsAliq getIcm60() {
		return icm60;
	}
	public void setIcm60(IcmsAliq icm60) {
		this.icm60 = icm60;
	}
	public IcmsAliq getIcm20() {
		return icm20;
	}
	public void setIcm20(IcmsAliq icm20) {
		this.icm20 = icm20;
	}
}