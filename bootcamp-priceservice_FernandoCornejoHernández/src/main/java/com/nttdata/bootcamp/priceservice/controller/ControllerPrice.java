package com.nttdata.bootcamp.priceservice.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.priceservice.model.Price;
import com.nttdata.bootcamp.priceservice.service.ServicePriceI;

@RestController
@RequestMapping("/precio")
public class ControllerPrice {
	
	@Autowired
	private ServicePriceI priceService;
	
	@GetMapping("/conseguirPrecio/{id}")
	public BigDecimal conseguirPrecio(final @PathVariable Integer id) {
		return priceService.conseguirPrecio(id);
	}
	
	@GetMapping("/conseguirTodo")
	public String conseguirTodo(){
		String resultado="";
		List<Price> lista = priceService.conseguirTodo();
			for(Price datos : lista) {
				resultado = resultado + "Producto: "+ datos.getDescription()+ " su precio es: "+datos.getPrice()+"€ \n";
			}
		return resultado;
	}
}
