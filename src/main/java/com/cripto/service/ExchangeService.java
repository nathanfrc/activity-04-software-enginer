package com.cripto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.cripto.domain.Exchange;
import com.cripto.repository.ExchangeRepository;
import com.cripto.service.exceptions.DataIntegrityException;


@Service
public class ExchangeService {

	@Autowired
	private ExchangeRepository repo;
	
	public List<Exchange> findAll() {		
		return repo.findAll();
	}

	public Exchange find(Integer id) {
		Optional<Exchange> obj = repo.findById(id);
		return obj.orElseThrow( () -> new com.cripto.service.exceptions.ObjetoNaoEncontradoException( "Objeto não encontrado. ID: " + id + ", Tipo: " + Exchange.class.getName()));
	}


	public Exchange insert(Exchange obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Exchange update(Exchange obj) {
		find(obj.getId());
		return repo.save(obj);
	}


	public void delete(Integer id) {
		find(id);		
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Exchange não pode ser deletada!");
		}		
		
	}



}
