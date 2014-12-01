package com.estore.catalog.datamodel;

import java.sql.Timestamp;
import java.util.Set;

public class Category {

	private String id;
	private String title;
	private String description;
	private Timestamp created;
	private String image;
	private Set<Product> products;
	private Category parentCategory;
	private Set<Category> childCategories;
	private boolean isRootCategory;
	
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
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public Set<Product> getProducts() {
		return products;
	}
	
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public Category getParentCategory() {
		return parentCategory;
	}
	
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
	
	public Set<Category> getChildCategories() {
		return childCategories;
	}
	
	public void setChildCategories(Set<Category> childCategories) {
		this.childCategories = childCategories;
	}

	public boolean isRootCategory() {
		return isRootCategory;
	}

	public void setRootCategory(boolean isRootCategory) {
		this.isRootCategory = isRootCategory;
	}
}
