package com.topinternacional.linx.bean.nfe.root;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.topinternacional.linx.bean.nfe.Destinatario;
import com.topinternacional.linx.bean.nfe.Especificacao;
import com.topinternacional.linx.bean.nfe.Emitente;
import com.topinternacional.linx.bean.nfe.Identificacao;
import com.topinternacional.linx.bean.nfe.Transporte;

@XStreamAlias("infNFe")
public class InfNFe {
	
	@XStreamAsAttribute
	@XStreamAlias("Id")
    protected String id="NFe13211004387155000264656020000000071816671501";
	
	@XStreamAsAttribute
    protected String versao="4.00";
	
	@XStreamAlias("ide")
	private Identificacao ide = new Identificacao();
	
	private Emitente emit = new Emitente();
	
	private Destinatario dest = new Destinatario();
	
	@XStreamAlias("det")
	private Especificacao item = new Especificacao();
	
	private Total total = new Total();
	
	private Transporte transp = new Transporte();
	
	private Pagamento pag = new Pagamento();
	
	private InfAdicionais infAdic =  new InfAdicionais();
	
	private InfRespTec infRespTec = new InfRespTec(); 
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public Identificacao getIde() {
		return ide;
	}
	public void setIde(Identificacao ide) {
		this.ide = ide;
	}
	public Emitente getEmit() {
		return emit;
	}
	public void setEmit(Emitente emit) {
		this.emit = emit;
	}
	public Destinatario getDest() {
		return dest;
	}
	public void setDest(Destinatario dest) {
		this.dest = dest;
	}
	public Especificacao getItem() {
		return item;
	}
	public void setItem(Especificacao item) {
		this.item = item;
	}
	public Total getTotal() {
		return total;
	}
	public void setTotal(Total total) {
		this.total = total;
	}
	public Transporte getTransp() {
		return transp;
	}
	public void setTransp(Transporte transp) {
		this.transp = transp;
	}
	public Pagamento getPag() {
		return pag;
	}
	public void setPag(Pagamento pag) {
		this.pag = pag;
	}
	public InfAdicionais getInfAdic() {
		return infAdic;
	}
	public void setInfAdic(InfAdicionais infAdic) {
		this.infAdic = infAdic;
	}
	public InfRespTec getInfRespTec() {
		return infRespTec;
	}
	public void setInfRespTec(InfRespTec infRespTec) {
		this.infRespTec = infRespTec;
	}
}
