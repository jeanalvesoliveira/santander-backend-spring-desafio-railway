package br.com.jean.app.model.entity;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_account")
public class Account {

	/*
	 * Atributos
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	private String agency;
	
	@Column(precision = 2, scale = 14)
	private BigDecimal balance;
	
	@Column(name = "account_limit", precision = 2, scale = 14)
	private BigDecimal limit;

	
	/*
	 * Construtores
	 */
	
	
	/*
	 * Getters e Setters
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNumber() {
		return number;
	}	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAgency() {
		return agency;
	}	
	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}	
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	public BigDecimal getLimit() {
		return limit;
	}	
	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}
	
	
	/*
	 * toString, hashCode e Equals
	 */	
	@Override
	public String toString() {
		return "Account [id=" + id + ", number=" + number + ", agency=" + agency + ", balance=" + balance + ", limit="
				+ limit + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(agency, balance, id, limit, number);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(agency, other.agency) && Objects.equals(balance, other.balance)
				&& Objects.equals(id, other.id) && Objects.equals(limit, other.limit)
				&& Objects.equals(number, other.number);
	}
	
	
}
