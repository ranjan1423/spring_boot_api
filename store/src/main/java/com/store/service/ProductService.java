package com.store.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.dao.ProductDao;
import com.store.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	public Product createProduct(Product product) {
		return productDao.save(product);
	}

	public Optional<Product> listProductById(Integer productId) {
		return productDao.findById(productId);
	}

	public Iterable<Product> listAllProducts() {
		return productDao.findAll();
	}

	public void deleteProductById(Integer productId) {
		productDao.deleteById(productId);
	}
}