package com.estore.datamodel.catalog;

import java.sql.Timestamp;
import java.util.Set;

public class Product {

	private String id;
	private String title;
	private String description;
	private Timestamp created;
	private String mainImage;
	private Set<String> images;
	private Category defaultParentCategory;
	private Set<String> parentCategories;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getCreated() {
		return created;
	}
	
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	
	public String getMainImage() {
		return mainImage;
	}
	
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}
	
	public Set<String> getImages() {
		return images;
	}
	
	public void setImages(Set<String> images) {
		this.images = images;
	}

	public Category getDefaultParentCategory() {
		return defaultParentCategory;
	}

	public void setDefaultParentCategory(Category defaultParentCategory) {
		this.defaultParentCategory = defaultParentCategory;
	}

	public Set<String> getParentCategories() {
		return parentCategories;
	}

	public void setParentCategories(Set<String> defaultParentCategories) {
		this.parentCategories = defaultParentCategories;
	}
	
	
}
