package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("IPI")
public class Ipi {
	
	private String cEnq;
	
	@XStreamAlias("IPINT")
	private IpiNt ipiNt = new IpiNt();
	
	@XStreamAlias("IPITrib")
	private IPITrib ipiTrib = new IPITrib();

	public String getcEnq() {
		return cEnq;
	}
	public void setcEnq(String cEnq) {
		this.cEnq = cEnq;
	}
	public IPITrib getIpiTrib() {
		return ipiTrib;
	}
	public void setIpiTrib(IPITrib ipiTrib) {
		this.ipiTrib = ipiTrib;
	}
	public IpiNt getIpiNt() {
		return ipiNt;
	}
	public void setIpiNt(IpiNt ipiNt) {
		this.ipiNt = ipiNt;
	}

}
