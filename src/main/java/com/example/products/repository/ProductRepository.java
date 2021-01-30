package com.example.products.repository;

import java.util.List;

import com.example.products.model.Product;

public interface ProductRepository {
	List<Product> getProducts();
	Product getProductById(Long id);
	Product createProduct(Product product);
	Product saveProduct(Product product);
	void deleteProduct(Long id);
}
