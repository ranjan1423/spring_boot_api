package com.store.dao;

import org.springframework.data.repository.CrudRepository;

import com.store.entity.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {

}