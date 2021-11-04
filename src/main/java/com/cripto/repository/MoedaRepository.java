package com.cripto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cripto.domain.Exchange;
import com.cripto.domain.Moeda;


@Repository
public interface MoedaRepository extends JpaRepository<Moeda, Integer>  {

}
