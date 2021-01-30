package com.example.products.model;

public class Product {
	private String productName;
	private String price;
	private Long id;
	public Product(String productName, String price, Long id) {
		super();
		this.productName = productName;
		this.price = price;
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
