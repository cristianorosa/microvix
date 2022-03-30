package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.topinternacional.linx.bean.nfe.TotalNFe;

public class Total {
	
	@XStreamAlias("ICMSTot")
	private TotalNFe icmsTotal = new  TotalNFe();

	public TotalNFe getIcmsTotal() {
		return icmsTotal;
	}
	public void setIcmsTotal(TotalNFe icmsTotal) {
		this.icmsTotal = icmsTotal;
	}
	
}
