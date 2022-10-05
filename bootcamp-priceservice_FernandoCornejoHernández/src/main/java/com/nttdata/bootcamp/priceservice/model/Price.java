package com.nttdata.bootcamp.priceservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;

@Entity
@Table(name ="prices")
public class Price implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "code_product")
	private String code_product;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price")
	private BigDecimal price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode_product() {
		return code_product;
	}
	public void setCode_product(String code_product) {
		this.code_product = code_product;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	

}
