package com.cripto.dto;

import java.io.Serializable;

import com.cripto.domain.Exchange;

public class ExchangeDTO implements Serializable {

	public ExchangeDTO(Exchange exchange) {
		this.id = exchange.getId();
		this.nome = exchange.getNome();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private Integer id;
	private String nome;

	
}
