
package com.topinternacional.linx.controller.imp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.topinternacional.linx.api.BasicController;
import com.topinternacional.linx.bean.nfe.DetPagamento;
import com.topinternacional.linx.bean.nfe.root.InfNFe;

@Controller
public class NFeController extends BasicController{

	@GetMapping("/admin/nfe")
	public String nfe( @RequestParam(name="action", required=false, defaultValue="none") String action
					  , Model model
			          ) throws IOException {
		
		if (action.equalsIgnoreCase("xmloutput")) {
			 
			InfNFe nfe = new InfNFe();
			 
			 XStream stream = new XStream(new DomDriver());
			 stream.processAnnotations(InfNFe.class);
			 
			 nfe.getIde().setcUf(13);
			 nfe.getIde().setcNF("81667150");
			 nfe.getIde().setcMunFG(454);
			 nfe.getIde().setnNF(81667150);
			 nfe.getIde().setNatOp("S EUR VENDA MERCADORIA");
			 nfe.getIde().setMod(65);
			 nfe.getIde().setSerie(602);
			 nfe.getIde().setnNF(7);
			 nfe.getIde().setDhEmi("2021-10-27T11:47:00-04:00");
			 nfe.getIde().setTpNF(1);
			 nfe.getIde().setIdDest(1);
			 nfe.getIde().setcMunFG(1302603);
			 nfe.getIde().setTpImp(4);
			 nfe.getIde().setTpEmis(1);
			 nfe.getIde().setcDV(1);
			 nfe.getIde().setTpAmb(2);
			 nfe.getIde().setFinNFe(1);
			 nfe.getIde().setIndFinal(1);
			 nfe.getIde().setIndPres(1);
			 nfe.getIde().setProcEmi(0);
			 nfe.getIde().setVerProc("NFC-e R64");
			 
			 nfe.getEmit().setCnpj("04387155000264");
			 nfe.getEmit().setxNome("TOP INTERNACIONAL - LOJA - GUILHERME MOREIRA");
			 nfe.getEmit().getEnderEmit().setxLgr("RUA GUILHERME MOREIRA");
			 nfe.getEmit().getEnderEmit().setNro("155");
			 nfe.getEmit().getEnderEmit().setxBairro("CENTRO");
			 nfe.getEmit().getEnderEmit().setcMun("1302603");
			 nfe.getEmit().getEnderEmit().setxMun("Manaus");
			 nfe.getEmit().getEnderEmit().setUf("AM");
			 nfe.getEmit().getEnderEmit().setCep("69005300");
			 nfe.getEmit().getEnderEmit().setcPais("1058");
			 nfe.getEmit().getEnderEmit().setxPais("BRASIL");
			 nfe.getEmit().getEnderEmit().setFone("9221275757");
			 nfe.getEmit().setIe("041723708");
			 nfe.getEmit().setCrt("1");
			 
			 nfe.getDest().setCpf("88596800263");
			 nfe.getDest().setxNome("NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
			 nfe.getDest().setIndIEDest("9");
			 
			 nfe.getItem().setnItem(1);
			 nfe.getItem().getProd().setcProd("18083");
			 nfe.getItem().getProd().setcEan("SEM GTIN");
			 nfe.getItem().getProd().setxProd("NOTA FISCAL EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
			 nfe.getItem().getProd().setNcm("33030020");
			 nfe.getItem().getProd().setCfop(5102);
			 nfe.getItem().getProd().setuCom("UN");
			 nfe.getItem().getProd().setqCom("1.0000");
			 nfe.getItem().getProd().setvUnCom("45.0000000000");
			 nfe.getItem().getProd().setvProd("45.00");
			 nfe.getItem().getProd().setcEanTrib("SEM GTIN");
			 nfe.getItem().getProd().setuTrib("UN");
			 nfe.getItem().getProd().setqTrib("1.0000");
			 nfe.getItem().getProd().setvUnTrib("45.0000");
			 nfe.getItem().getProd().setIndTot("1");
			 
			 nfe.getItem().getImposto().setvTotTrib("10.46");
			 
			 nfe.getItem().getImposto().getIcms().getIcm00().setOrig("2");
			 nfe.getItem().getImposto().getIcms().getIcm00().setCst("00");
			 nfe.getItem().getImposto().getIcms().getIcm00().setModBc("3");
			 nfe.getItem().getImposto().getIcms().getIcm00().setvCb("45.00");
			 nfe.getItem().getImposto().getIcms().getIcm00().setpICMS("18.0000");
			 nfe.getItem().getImposto().getIcms().getIcm00().setvIcms("8.10");
			 
			 nfe.getItem().getImposto().getPis().getPisAliq().setCst("01");
			 nfe.getItem().getImposto().getPis().getPisAliq().setvCb("36.90");
			 nfe.getItem().getImposto().getPis().getPisAliq().setpPis("0.6500");
			 nfe.getItem().getImposto().getPis().getPisAliq().setvPis("0.24");
			 
			 nfe.getItem().getImposto().getCofins().getCofinsAliq().setCst("01");
			 nfe.getItem().getImposto().getCofins().getCofinsAliq().setVbc("36.90");
			 nfe.getItem().getImposto().getCofins().getCofinsAliq().setPconfins("3.0000");
			 nfe.getItem().getImposto().getCofins().getCofinsAliq().setVcofins("1.11");
			 
			 nfe.getTotal().getIcmsTotal().setvBC("45.00");
			 nfe.getTotal().getIcmsTotal().setvICMS("8.10");
			 nfe.getTotal().getIcmsTotal().setvICMSDeson("0.00");
			 nfe.getTotal().getIcmsTotal().setvFCP("0.00");
			 nfe.getTotal().getIcmsTotal().setvBCST("0.00");
			 nfe.getTotal().getIcmsTotal().setvST("0.00");
			 nfe.getTotal().getIcmsTotal().setvFCPST("0.00");
			 nfe.getTotal().getIcmsTotal().setvFCPSTRet("0.00");
			 nfe.getTotal().getIcmsTotal().setvProd("45.00");
			 nfe.getTotal().getIcmsTotal().setvFrete("0.00");
			 nfe.getTotal().getIcmsTotal().setvSeg("0.00");
			 nfe.getTotal().getIcmsTotal().setvDesc("0.00");
			 nfe.getTotal().getIcmsTotal().setvII("0.00");
			 nfe.getTotal().getIcmsTotal().setvIPI("0.00");
			 nfe.getTotal().getIcmsTotal().setvIPIDevol("0.00");
			 nfe.getTotal().getIcmsTotal().setvIPI("0.00");
			 nfe.getTotal().getIcmsTotal().setvIPIDevol("0.00");
			 nfe.getTotal().getIcmsTotal().setvPIS("0.24");
			 nfe.getTotal().getIcmsTotal().setvCOFINS("1.11");
			 nfe.getTotal().getIcmsTotal().setvOutro("0.00");
			 nfe.getTotal().getIcmsTotal().setvNF("45.00");
			 nfe.getTotal().getIcmsTotal().setvTotTrib("10.46");
			 
			 nfe.getTransp().setModFrete("9");
			 
			 List<DetPagamento> pagtos = new ArrayList<DetPagamento>();
			 DetPagamento pag = new DetPagamento();
			 pag.setIndPag("0");
			 pag.settPag("01");
			 pag.setvPag("01");
			 pagtos.add(pag);
			 
			 nfe.getPag().setDetPag(pag);
			 
			 
			 nfe.getInfAdic().setInfCpl("Token do Troca Facil: 146981f737271021 Nome do Vendedor:\n"
			 		+ "		  Vendedor Padrao Valor ICMS Desonerado:0,00 Excluido o ICMS da Base\n"
			 		+ "		  de Calculo do PIS e COFINS.\n"
			        + "		");
			 
			 nfe.getInfRespTec().setCnpj("54517628000198");
			 nfe.getInfRespTec().setxContato("Joao Ricardo B. Cestari");
			 nfe.getInfRespTec().setEmail("lideranca.ped@linx.com.br");
			 nfe.getInfRespTec().setFone("1130030400");
			 						
			 model.addAttribute("xml", stream.toXML(nfe));
		}			
		
		return "admin/nfe";	
	}
	
	@GetMapping("/nfe/status")
	@ResponseBody
	public String getStatus(Model model) {			
		return status.getDescricao()+":"+andamento;			
	}
	
	
}