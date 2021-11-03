package com.HudLuca.DsVendas.entitites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate Date;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	public Sale() {
		
	}

	public Sale(long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		Date = date;
		this.seller = seller;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
