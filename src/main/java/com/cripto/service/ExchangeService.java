package com.cripto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cripto.domain.Exchange;
import com.cripto.repository.ExchangeRepository;



@Service
public class ExchangeService {

	@Autowired
	private ExchangeRepository repo;
	
	
	public List<Exchange> findAll() {		
		return repo.findAll();
	}
}
