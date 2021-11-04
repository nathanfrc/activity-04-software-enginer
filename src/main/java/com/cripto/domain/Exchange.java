package com.cripto.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Exchange implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String site;
	
	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	private String cod;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public List<Moeda> getMoeda() {
		return moeda;
	}

	public void setMoeda(List<Moeda> moeda) {
		this.moeda = moeda;
	}

	@OneToMany(mappedBy = "exchange")	
	private List<Moeda> moeda = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
