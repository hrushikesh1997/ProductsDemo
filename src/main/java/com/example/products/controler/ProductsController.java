package com.example.products.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.exceptions.ResourceNotFound;
import com.example.products.model.Product;
import com.example.products.service.ProductService;

@RestController
public class ProductsController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getProducts() throws ResourceNotFound{
		List<Product> products = productService.getProducts();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id) throws ResourceNotFound {
		Product product = productService.getProductById(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	@PostMapping("/product")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		product = productService.create(product);
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
	}
	@PutMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		product = productService.update(product);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	@DeleteMapping("/product/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}
}
