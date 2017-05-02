package com.testevalemobi.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mercadoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoMercadoria;
	
	@Column(nullable = false)
	private String tipoMercadoria;
	
	@Column(nullable = false)
	private String nomeMercadoria;
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(precision = 10, scale = 2, nullable=false)
	private BigDecimal preco;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoNegocio tipoNegocio;
	
	//getters and setters
	public Long getCodigoMercadoria() {
		return codigoMercadoria;
	}
	public void setCodigoMercadoria(Long codigoMercadoria) {
		this.codigoMercadoria = codigoMercadoria;
	}
	public String getTipoMercadoria() {
		return tipoMercadoria;
	}
	public void setTipoMercadoria(String tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}
	public String getNomeMercadoria() {
		return nomeMercadoria;
	}
	public void setNomeMercadoria(String nomeMercadoria) {
		this.nomeMercadoria = nomeMercadoria;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public TipoNegocio getTipoNegocio() {
		return tipoNegocio;
	}
	public void setTipoNegocio(TipoNegocio tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoMercadoria == null) ? 0 : codigoMercadoria.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mercadoria other = (Mercadoria) obj;
		if (codigoMercadoria == null) {
			if (other.codigoMercadoria != null)
				return false;
		} else if (!codigoMercadoria.equals(other.codigoMercadoria))
			return false;
		return true;
	}
	
}
