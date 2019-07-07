package com.loyality_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.loyality_project.model.Product;
import com.loyality_project.repository.product_Repository;

@Service
public class ProductService {

	@Autowired;
	private product_Repository productRepository;
	
	
	public Product create(String id, String product_name, int loyality_product_cost, int actual_cost ) {
		
		return productRepository.save(new Product(id, product_name, loyality_product_cost,loyality_product_cost ));
	} 
	
	
	
	public List<Product> getAll(){
		return productRepository.findAll();
	}
	
	
	public Product getById(String id) {
		return productRepository.findById(id);
		
	}
	
	
	public Product update(String id,String produtctname, int productCost, int actualCost) {
		
		Product p=productRepository.findById(id);
		p.setProduct_name(produtctname);
		p.setLoyality_product_cost(productCost);
		p.setActual_cost(actualCost);
		 return productRepository.save(p);
		
	}
		
	
	public void delete(String id) {
		Product p=productRepository.findById(id);
		productRepository.delete(p);
	}
	
	
}
	