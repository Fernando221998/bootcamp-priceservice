package com.nttdata.bootcamp.priceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.bootcamp.priceservice.model.Price;

public interface RepositoryPrice extends JpaRepository<Price, Integer>{
	
	public Price findById(int id);

}
