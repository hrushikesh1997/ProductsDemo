package com.example.products.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.products.model.Product;

@Repository
public class InMemoryProductsRepository implements ProductRepository {

	private HashMap<Long, Product> products = new HashMap<>();
	private Long id = 0L;
	@Override
	public List<Product> getProducts() {
		return new ArrayList<>(products.values());
	}
	@Override
	public Product getProductById(Long id) {
		return products.get(id);
	}
	@Override
	public Product createProduct(Product product) {
		Long id = this.id+1;
		this.id+=1;
		product.setId(id);
		products.put(id,product);
		return product;
	}
	@Override
	public Product saveProduct(Product product) {
		if(getProductById(product.getId()) == null) {
			return null;
		}
		products.replace(product.getId(), product);
		return product;
	}
	@Override
	public void deleteProduct(Long id) {
		products.remove(id);
	}
}
