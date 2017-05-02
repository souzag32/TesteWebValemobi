package com.testevalemobi.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.testevalemobi.model.entity.Mercadoria;

public class MercadoriaDao {

	private EntityManager manager;
	
	public MercadoriaDao(EntityManager manager){
		this.manager = manager;
	}
	
	/**
	 * Metodo que adiciona uma mercadoria no banco de dados
	 * @param mercadoria
	 */
	public void adicionaMercadoria(Mercadoria mercadoria) throws Exception{
		try{
			manager.persist(mercadoria);
		} catch(Exception e){
			throw new Exception(e);
		}
	}
	
	/**
	 * metodo que retorna a lista de mercadorias do banco de dados
	 * @return
	 */
	public List<Mercadoria> listaMercadoria(){
		return manager.createQuery("from Mercadoria",Mercadoria.class).getResultList();
	}
}
