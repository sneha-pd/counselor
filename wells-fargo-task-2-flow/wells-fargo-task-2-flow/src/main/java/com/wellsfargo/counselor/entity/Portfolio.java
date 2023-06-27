package com.wellsfargo.counselor.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Portfolio {

	@Id
	@GeneratedValue()
	private long portfolioId;
	@Column(nullable = false)
	private long clientId;
	@Column(nullable = false)
	private Date creationDate;

	public Portfolio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Portfolio(long portfolioId, long clientId, Date creationDate) {
		super();
		this.portfolioId = portfolioId;
		this.clientId = clientId;
		this.creationDate = creationDate;
	}

	public long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
