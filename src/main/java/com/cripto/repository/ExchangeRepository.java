package com.cripto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cripto.domain.Exchange;


@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, Integer>  {

}
