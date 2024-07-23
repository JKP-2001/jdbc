package com.example.demo;

import java.io.IOException;
import java.sql.*;

import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.model.Product;
import com.example.demo.services.ProductService;
import com.example.demo.utils.ConnectionUtils;

public class Application {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Connection con = ConnectionUtils.getOracleConnection();

		CrudRepositoryImpl repo = new CrudRepositoryImpl(con);
		ProductService productService = new ProductService(repo);
		productService.add(new Product(101,"dell laptop",483992));
	}

}
