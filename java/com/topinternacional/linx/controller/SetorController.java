package com.topinternacional.linx.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.topinternacional.linx.repository.SetorRepository;

@Controller
public class SetorController {

	@Autowired
	private SetorRepository setorRepository;
	
	@GetMapping("/setor")
	public String setor(@RequestParam(name="action", required=false, defaultValue="none") String action, Model model) {

		if (action.equalsIgnoreCase("none")) {
			model.addAttribute("listSetores", setorRepository.findAll());
		} else {
			model.addAttribute("listSetores", setorRepository.findAll());

			importar();	
		}
				
		return "setor";
	}
	
	private void importar() {
		try {
			 String url = "https://webapi.microvix.com.br/1.0/importador.svc";
			 URL obj = new URL(url);
			 HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			 con.setRequestMethod("POST");
			 con.setRequestProperty("SOAPAction","\"http://tempuri.org/IImportador/Importar\"");
			 con.setRequestProperty("Accept","gzip,deflate");
			 con.setRequestProperty("Accept","text/xml");
			 con.setRequestProperty("Content-Type","text/xml;charset=UTF-8");
			 
			 String xml = getXml();
			 con.setDoOutput(true);
			 DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			 wr.writeBytes(xml);
			 wr.flush();
			 wr.close();
			 String responseStatus = con.getResponseMessage();
			 System.out.println(responseStatus);
			 BufferedReader in = new BufferedReader(new InputStreamReader(
			 con.getInputStream()));
			 String inputLine;
			 StringBuffer response = new StringBuffer();
			 
			 while ((inputLine = in.readLine()) != null) {
				 response.append(inputLine);
			 }
			 
			 in.close();
			 System.out.println("response:" + response.toString());
		 } catch (Exception e) {
			 System.out.println(e);
		 }		
	}
	
	private static String getXml() {
		return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\" xmlns:linx=\"http://schemas.datacontract.org/2004/07/Linx.Microvix.WebApi.Importacao.Requests\" xmlns:linx1=\"http://schemas.datacontract.org/2004/07/Linx.Microvix.WebApi.Business.Api\" xmlns:linx2=\"http://schemas.datacontract.org/2004/07/Linx.Microvix.WebApi.Importacao\">\n"
				+ "   <soapenv:Header/>"
				+ "   <soapenv:Body>"
				+ "      <tem:Importar>"
				+ "         <tem:request>"
				+ "            <linx:ParamsSeletorDestino>"
				+ "               <!--Zero or more repetitions:-->"
				+ "               <linx1:CommandParameter>"
				+ "                  <linx1:Name>chave</linx1:Name>"
				+ "                  <linx1:Value>051BECF0-BB15-41A2-A430-8325376F8FA2</linx1:Value>"
				+ "               </linx1:CommandParameter>"
				+ "               <linx1:CommandParameter>"
				+ " 			   <linx1:Name>cnpjEmp</linx1:Name>"
				+ "                  <linx1:Value>04387155000264</linx1:Value>"
				+ "               </linx1:CommandParameter>"
				+ "               <linx1:CommandParameter>"
				+ "                  <linx1:Name>IdPortal</linx1:Name>"
				+ "                  <linx1:Value>14698</linx1:Value>"
				+ "               </linx1:CommandParameter>"
				+ "            </linx:ParamsSeletorDestino>"
				+ "            <linx:Tabela>"
				+ "               <linx2:Comando>LinxCadastraSetores</linx2:Comando>"
				+ "               <linx2:Registros>"
				+ "                  <!--Zero or more repetitions:-->"
				+ "                  <linx:Registros>"
				+ "                     <linx:Colunas>"
				+ "                        <linx1:CommandParameter>"
				+ "                           <linx1:Name>codigo</linx1:Name>"
				+ "                           <linx1:Value>20</linx1:Value>"
				+ "                        </linx1:CommandParameter>"
				+ "                        <linx1:CommandParameter>"
				+ "                           <linx1:Name>nome_setor</linx1:Name>"
				+ "                           <linx1:Value>Perfumaria</linx1:Value>"
				+ "                        </linx1:CommandParameter>"
				+ "                     </linx:Colunas>"
				+ "                  </linx:Registros>"
				+ "                  <linx:Registros>"
				+ "                     <linx:Colunas>"
				+ "                        <linx1:CommandParameter>"
				+ "                           <linx1:Name>codigo</linx1:Name>"
				+ "                           <linx1:Value>21</linx1:Value>"
				+ "                        </linx1:CommandParameter>"
				+ "                        <linx1:CommandParameter>"
				+ "                           <linx1:Name>nome_setor</linx1:Name>"
				+ "                           <linx1:Value><![CDATA[Casa e Decoração]]></linx1:Value>"
				+ "                        </linx1:CommandParameter>"
				+ "                     </linx:Colunas>"
				+ "                  </linx:Registros>"
				+ "                  <linx:Registros>"
				+ "                     <linx:Colunas>"
				+ "                        <linx1:CommandParameter>"
				+ "                           <linx1:Name>codigo</linx1:Name>"
				+ "                           <linx1:Value>22</linx1:Value>"
				+ "                        </linx1:CommandParameter>"
				+ "                        <linx1:CommandParameter>"
				+ "                           <linx1:Name>nome_setor</linx1:Name>"
				+ "                           <linx1:Value>Bebidas</linx1:Value>"
				+ "                        </linx1:CommandParameter>"
				+ "                     </linx:Colunas>"
				+ "                  </linx:Registros>"
				+ "                  <linx:Registros>"
				+ "                     <linx:Colunas>"
				+ "                        <linx1:CommandParameter>"
				+ "                           <linx1:Name>codigo</linx1:Name>"
				+ "                           <linx1:Value>23</linx1:Value>"
				+ "                        </linx1:CommandParameter>"
				+ "                        <linx1:CommandParameter>"
				+ "                           <linx1:Name>nome_setor</linx1:Name>"
				+ "                           <linx1:Value>Cosmeticos</linx1:Value>"
				+ "                        </linx1:CommandParameter>"
				+ "                     </linx:Colunas>"
				+ "                  </linx:Registros>"
				+ "               </linx2:Registros>"
				+ "            </linx:Tabela>"
				+ "            <linx:UserAuth>"
				+ "               <linx2:Pass>linx_import</linx2:Pass>"
				+ "               <linx2:User>linx_import</linx2:User>"
				+ "            </linx:UserAuth>"
				+ "         </tem:request>"
				+ "      </tem:Importar>"
				+ "   </soapenv:Body>"
				+ "</soapenv:Envelope>";
	}
}