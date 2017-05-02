package com.testevalemobi.action;

import javax.persistence.EntityManager;

import com.testevalemobi.service.MercadoriaService;

public class ListaMercadoriaAction extends Action{

	@Override
	public void process(EntityManager manager) throws Exception {
		try{
			MercadoriaService service = new MercadoriaService();
			getRequest().setAttribute("mercadorias", service.listaMercadoria(manager));
			forward("lista-mercadoria.jsp");
		} catch(Exception e){
			throw e;
		}
	}

	
}
