package com.store.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.entity.Product;
import com.store.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(value = "/create")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	@GetMapping(value = "/list/{productId}")
	public Optional<Product> getProductById(@PathVariable("productId") Integer productId) {
		return productService.listProductById(productId);
	}

	@GetMapping(value = "/listall")
	public Iterable<Product> getAllProducts() {
		return productService.listAllProducts();
	}
	
	@PostMapping(value = "/delete")
	public String getAllProducts(@RequestBody Integer productId) {
		productService.deleteProductById(productId);
		return "item deleted by id "+ productId;
	}
}