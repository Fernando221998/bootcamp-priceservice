package com.nttdata.bootcamp.priceservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.priceservice.model.Price;
import com.nttdata.bootcamp.priceservice.repository.RepositoryPrice;

@Service
public class ServicePriceImpl implements ServicePriceI {
	
	@Autowired
	private RepositoryPrice priceRepository;

	@Override
	public BigDecimal conseguirPrecio(Integer id) {
		return priceRepository.findById(id).get().getPrice();
	}

	@Override
	public List<Price> conseguirTodo() {
		return priceRepository.findAll();
	}

}
