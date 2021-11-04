package com.cripto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cripto.domain.Moeda;
import com.cripto.repository.MoedaRepository;


@Service
public class MoedaService {

	@Autowired
	private MoedaRepository repo;
	
	public Moeda insert(Moeda obj) {
		obj.setId(null);
		return repo.save(obj);
	}

}
