package com.kh.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String jdbcUsername = "khbank";
	private static final String jdbcUserpw = "1234";
	
	public ProductDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<>();
		try {
			Connection connect = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcUserpw);
			String sql = "SELECT * FROM PRODUCTS";
			PreparedStatement ps = connect.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int productId = rs.getInt("product_id");
				String productName = rs.getString("product_name");
				String category = rs.getString("category");
				double price = rs.getDouble("price");
				int stockQuantity = rs.getInt("stock_quantity");
				
				Product product = new Product(productId, productName, category, price, stockQuantity);
				products.add(product);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return products;
	}

	public Product getProductId(int productId) {
	    Product product = null;

	    try {
	        Connection connect = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcUserpw);

	        String sql = "SELECT * FROM PRODUCTS WHERE PRODUCT_ID = ?";
	        PreparedStatement ps = connect.prepareStatement(sql);
	        ps.setInt(1, productId);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            int productID = rs.getInt("product_id");
	            String productName = rs.getString("product_name");
	            String category = rs.getString("category");
	            double price = rs.getDouble("price");
	            int stockQuantity = rs.getInt("stock_quantity");

	            product = new Product(productID, productName, category, price, stockQuantity);
	        }
	        
	        rs.close();
	        ps.close();
	        connect.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return product;
	}

}

