package com.wellsfargo.counselor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Portfolio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long portfolioId;

	@OneToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@Column(nullable = false)
	private String creationDate;

	protected Portfolio() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Portfolio(long portfolioId, Client client, String creationDate) {
		super();
		this.portfolioId = portfolioId;
		this.client = client;
		this.creationDate = creationDate;
	}

	public long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

}
