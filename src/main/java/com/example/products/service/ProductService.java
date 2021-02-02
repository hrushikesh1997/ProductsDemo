package com.example.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.products.exceptions.ResourceNotFound;
import com.example.products.model.Product;
import com.example.products.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product create(Product product) {
		return productRepository.createProduct(product);
	}
	
	public List<Product> getProducts() throws ResourceNotFound {
		List<Product> products = productRepository.getProducts();
		if(products.size() == 0) {
			throw new ResourceNotFound("No product found.");
		}
		return products;
	}
	
	public Product getProductById(Long id) throws ResourceNotFound {
		Product product = productRepository.getProductById(id);
		if(product == null) {
			throw new ResourceNotFound("No product with id: "+id+" found");
		}
		return product;
	}
	
	public Product update(Product product) {
		return productRepository.saveProduct(product);
	}
	
	public void deleteProduct(Long id) {
		productRepository.deleteProduct(id);
	}
	
}
