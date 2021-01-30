package com.example.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.products.model.Product;
import com.example.products.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product create(Product product) {
		return productRepository.createProduct(product);
	}
	
	public List<Product> getProducts(){
		return productRepository.getProducts();
	}
	
	public Product getProductById(Long id) {
		return productRepository.getProductById(id);
	}
	
	public Product update(Product product) {
		return productRepository.saveProduct(product);
	}
	
	public void deleteProduct(Long id) {
		productRepository.deleteProduct(id);
	}
	
}
