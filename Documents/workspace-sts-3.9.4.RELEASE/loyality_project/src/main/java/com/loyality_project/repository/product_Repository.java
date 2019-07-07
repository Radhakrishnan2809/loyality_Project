package com.loyality_project.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.loyality_project.model.Product;

@Repository
public interface product_Repository extends MongoRepository<Product, String> {
	
	public Product findById(String _id);

}
