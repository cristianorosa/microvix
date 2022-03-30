package com.topinternacional.linx.bean.nfe.root;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.topinternacional.linx.bean.nfe.DetPagamento;

public class Pagamento {

	@XStreamAlias("detPag")
	private List<DetPagamento> detPags = new ArrayList<>();
	
	public List<DetPagamento> getDetPags() {
		return detPags;
	}
	public void setDetPags(List<DetPagamento> detPags) {
		this.detPags = detPags;
	}
	public void setDetPag(DetPagamento pag) {
		detPags.add(pag);
	}
	
}
