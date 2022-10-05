package com.nttdata.bootcamp.priceservice.service;

import java.math.BigDecimal;
import java.util.List;

import com.nttdata.bootcamp.priceservice.model.Price;

public interface ServicePriceI {
	
	public BigDecimal conseguirPrecio(Integer id);
	
	public List<Price> conseguirTodo();

}
