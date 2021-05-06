package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSucessDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSucessDTO() {
	}

	

	public SaleSucessDTO(Seller seller, Long visted, Long deals) {
		sellerName = seller.getName();
		this.visited = visted;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisted() {
		return visited;
	}

	public void setVisted(Long visted) {
		this.visited = visted;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}
