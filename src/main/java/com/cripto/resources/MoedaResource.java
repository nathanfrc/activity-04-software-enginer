package com.cripto.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cripto.domain.Moeda;
import com.cripto.service.ExchangeService;
import com.cripto.service.MoedaService;


@RestController
//@RequestMapping(value = "/exchange")
public class MoedaResource {
	
	@Autowired
	MoedaService service;
	
	@Autowired
	ExchangeService serviceExchange;

	@RequestMapping(value = "/exchange/{id}/moeda", method = RequestMethod.POST)
	public ResponseEntity<?> insert(@RequestBody Moeda obj, @PathVariable Integer id) {	
		obj.setExchange(serviceExchange.find(id));
		obj = service.insert(obj);		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
