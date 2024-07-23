package com.example.demo.services;

import java.sql.Connection;
import java.util.List;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.ifaces.SortingRepository;
import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.model.Product;
import com.example.demo.utils.ConnectionUtils;

public class ProductService {

	
	private CrudRepositoryImpl repo;

	
	
	


	public ProductService(CrudRepositoryImpl repo) {
		
		super();
		
		this.repo=repo;
		

	}

	
	public boolean add(Product prod) {
		
		return this.repo.add(prod);
	}
	
	public List<Product> findAll() {
		
		return this.repo.findAll();
	}


//	public List<Product> sort(String string) {
//		return this.repo.sort(string);
//	}
}
