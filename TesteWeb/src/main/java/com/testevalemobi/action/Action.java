package com.testevalemobi.action;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testevalemobi.util.JPAUtil;

public abstract class Action {

	private HttpServletRequest request;
	private HttpServletResponse response;
	private EntityManager manager;
	
	public Action(){
		this.manager = JPAUtil.getEntityManager();
	}
	
	public void runAction() throws Exception{
		 
		try{
			manager.getTransaction().begin();
			process(manager);
			manager.getTransaction().commit();
		} catch(Exception e){
			manager.getTransaction().rollback();
		}finally{
			manager.close();
		}
	}
	
	public abstract void process(EntityManager manager) throws Exception;
	
	protected void forward(String path) throws Exception{
		request.getRequestDispatcher(path).forward(request, response);
	}
	
	protected void redirect(String path) throws Exception{
		String contextRoot = request.getContextPath();
		response.sendRedirect(contextRoot+"/"+path);
	}
	
	protected HttpSession getSession(){
		return request.getSession();
	}
	
	protected HttpServletRequest getRequest(){
		return request;
	}
	
	public void setRequest(HttpServletRequest request){
		this.request = request;
	}
	
	protected HttpServletResponse getResponse(){
		return response;
	}
	
	public void setResponse(HttpServletResponse response){
		this.response = response;
	}
	
}
