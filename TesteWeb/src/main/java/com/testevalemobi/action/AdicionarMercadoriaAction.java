package com.testevalemobi.action;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import com.testevalemobi.model.entity.Mercadoria;
import com.testevalemobi.model.entity.TipoNegocio;
import com.testevalemobi.service.MercadoriaService;

public class AdicionarMercadoriaAction extends Action{

	@Override
	public void process(EntityManager manager) throws Exception {
		String tipoMerc = getRequest().getParameter("tipo");
		String nomeMerc = getRequest().getParameter("nome");
		String qtde = getRequest().getParameter("quantidade");
		String preco = getRequest().getParameter("preco");
		String tipoNegocio = getRequest().getParameter("tipoNegocio");
		
		Mercadoria m = new Mercadoria();
		try{
			m.setTipoMercadoria(tipoMerc);
			m.setNomeMercadoria(nomeMerc);
			m.setQuantidade(Integer.parseInt(qtde));
			m.setPreco(new BigDecimal(Double.parseDouble(preco)));
			m.setTipoNegocio(TipoNegocio.valueOf(tipoNegocio));
			
			MercadoriaService service = new MercadoriaService();
			service.adicionaMercadoria(manager,m);
			redirect("ListaMercadoria.action");
		} catch (Exception e){
			throw e;
		}
	}

}
