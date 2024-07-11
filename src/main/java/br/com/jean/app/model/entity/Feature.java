package br.com.jean.app.model.entity;

import java.util.Objects;

public class Feature {

	/*
	 * Atributos
	 */
	private Long id;
	private String icon;
	private String description;
	
	
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
	
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	/*
	 * toString, hashCode e Equals
	 */	
	@Override
	public String toString() {
		return "Feature [id=" + id + ", icon=" + icon + ", description=" + description + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(description, icon, id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feature other = (Feature) obj;
		return Objects.equals(description, other.description) && Objects.equals(icon, other.icon)
				&& Objects.equals(id, other.id);
	}
}
