package com.loyality_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loyality_project.model.Product;
import com.loyality_project.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired;
	private ProductService productService;
	
	
	@RequestMapping("/create")
	public String create(@RequestParam String id, @RequestParam String product_name, @RequestParam int loyality_product_cost, @RequestParam int actual_cost ) {
		Product p=productService.create(id, product_name, loyality_product_cost, actual_cost);
		return p.toString();
		
	}
	
	@RequestMapping("/get")
	public Product getProduct(@RequestParam String id) {
		return productService.getById(id);
	}
	
	@RequestMapping("/getAll")
	public List<Product> getAll(){
		return productService.getAll();
	}
	
	
	
	@RequestMapping("/update")
	public String update(@RequestParam String id, @RequestParam String produtctname, @RequestParam int productCost, @RequestParam int actualCost ) {
		Product p=productService.update(id, produtctname, productCost, actualCost);
		return p.toString();
		
	}

	@RequestMapping("/delete")
	public String update(@RequestParam String id) {
		productService.delete(id);
		return "Deleted:"+ id;
		
	}


}
