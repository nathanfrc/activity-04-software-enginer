package com.cripto.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cripto.domain.Exchange;
import com.cripto.dto.ExchangeDTO;
import com.cripto.service.ExchangeService;


@RestController
@RequestMapping(value = "/exchange")
public class ExchangeResource {
	
	@Autowired
	ExchangeService service;


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ExchangeDTO>> findAll() {		
		List<Exchange> list = service.findAll();		
		List<ExchangeDTO> listDto = list.stream().map(obj -> new ExchangeDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
}
