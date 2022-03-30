package com.topinternacional.linx.bean.nfe;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.topinternacional.linx.bean.nfe.root.Imposto;

@XStreamAlias("det")
public class Especificacao {
	
	@XStreamAsAttribute
    private Integer nItem = 0;
	
	private Produto prod = new Produto();
	
	private Imposto imposto = new Imposto();
	
	@XStreamAlias("infAdProd")
	private String infAdProd;

	public Integer getnItem() {
		return nItem;
	}
	public void setnItem(Integer nItem) {
		this.nItem = nItem;
	}
	public Produto getProd() {
		return prod;
	}
	public void setProd(Produto prod) {
		this.prod = prod;
	}
	public Imposto getImposto() {
		return imposto;
	}
	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}
	public String getInfAdProd() {
		return infAdProd;
	}
	public void setInfAdProd(String infAdProd) {
		this.infAdProd = infAdProd;
	}
}
