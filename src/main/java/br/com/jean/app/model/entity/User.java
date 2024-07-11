package br.com.jean.app.model.entity;

import java.util.List;
import java.util.Objects;

public class User {

	/*
	 * Atributos
	 */
	private Long id;
	private String name;
	private Account account;
	private Card card;
	private List<Feature> features;
	private List<News> news;
	
	
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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	
	public List<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
	
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}
	
	
	/*
	 * toString, hashCode e Equals
	 */	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", account=" + account + ", card=" + card + ", features="
				+ features + ", news=" + news + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(account, card, features, id, name, news);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(account, other.account) && Objects.equals(card, other.card)
				&& Objects.equals(features, other.features) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(news, other.news);
	}
}
