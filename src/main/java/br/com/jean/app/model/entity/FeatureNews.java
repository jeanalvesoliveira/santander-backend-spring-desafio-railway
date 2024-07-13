package br.com.jean.app.model.entity;

import java.util.Objects;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class FeatureNews {

	/*
	 * Atributos
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String icon;
	private String description;
	
	
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
		return "News [id=" + id + ", icon=" + icon + ", description=" + description + "]";
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
		FeatureNews other = (FeatureNews) obj;
		return Objects.equals(description, other.description) && Objects.equals(icon, other.icon)
				&& Objects.equals(id, other.id);
	}
	
	

}
