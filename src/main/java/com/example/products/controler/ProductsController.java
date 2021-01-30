package com.example.products.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.model.Product;
import com.example.products.service.ProductService;

@RestController
public class ProductsController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		return productService.create(product);
	}
	@PutMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return productService.update(product);
	}
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
}
