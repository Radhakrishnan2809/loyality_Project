package com.loyality_project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

	@Id;
	String _id;
	String product_name;
	int loyality_product_cost;
	int actual_cost;
	
	
	
	
	
	public Product() {
		
	}

	


	public Product(String _id, String product_name, int loyality_product_cost, int actual_cost) {
		super();
		this._id = _id;
		this.product_name = product_name;
		this.loyality_product_cost = loyality_product_cost;
		this.actual_cost = actual_cost;
	}






	public String get_id() {
		return _id;
	}


	public void set_id(String _id) {
		this._id = _id;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public int getLoyality_product_cost() {
		return loyality_product_cost;
	}


	public void setLoyality_product_cost(int loyality_product_cost) {
		this.loyality_product_cost = loyality_product_cost;
	}


	public int getActual_cost() {
		int actual_cost;
	}


	public void setActual_cost(int actual_cost) {
		this.actual_cost = actual_cost;
	}




	@Override
	public String toString() {
		return "Product [_id=" + _id + ", product_name=" + product_name + ", loyality_product_cost="
				+ loyality_product_cost + ", actual_cost=" + actual_cost + "]";
	}
	
	
	
	
	
}
