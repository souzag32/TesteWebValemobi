package com.testevalemobi.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.testevalemobi.model.dao.MercadoriaDao;
import com.testevalemobi.model.entity.Mercadoria;

public class MercadoriaService {
	
	public void adicionaMercadoria(EntityManager manager, Mercadoria m) throws Exception{
		try{
			MercadoriaDao dao = new MercadoriaDao(manager);
			dao.adicionaMercadoria(m);
		} catch(Exception e){
			throw e;
		}
	}
	
	public List<Mercadoria> listaMercadoria(EntityManager manager)throws Exception{
		try{
			MercadoriaDao dao = new MercadoriaDao(manager);
			return dao.listaMercadoria();
		} catch(Exception e){
			throw e;
		}
	}
}
