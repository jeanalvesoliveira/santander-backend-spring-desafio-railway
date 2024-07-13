package br.com.jean.app.model.entity;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_card")
public class Card {

	/*
	 * Atributos
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	@Column(name = "card_limit", scale = 2, precision = 14)
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
		return "Card [id=" + id + ", number=" + number + ", limit=" + limit + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, limit, number);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(id, other.id) && Objects.equals(limit, other.limit)
				&& Objects.equals(number, other.number);
	}
}
