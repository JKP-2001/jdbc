package com.example.demo.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.model.Product;
import com.example.demo.utils.ConnectionUtils;

public class CrudRepositoryImpl implements CrudRepository {



	Connection con;



	public CrudRepositoryImpl(Connection con) throws IOException {
		super();

		this.con = con;

	}

	@Override
	public boolean add(Product object) {

		String sql = "insert into product values(?,?,?)";

		int rowAdded = 0;
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setInt(1, object.getProductId());
			pstmt.setString(2, object.getProductName());
			pstmt.setDouble(3, object.getRatePerUnit());

			rowAdded = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return rowAdded==1?true:false;
	}


	@Override
	public List<Product> findAll() {
		
		return null;
	}

}
