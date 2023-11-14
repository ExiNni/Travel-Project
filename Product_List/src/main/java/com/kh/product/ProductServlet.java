package com.kh.product;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	
	private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String jdbcUsername = "khbank";
	private static final String jdbcUserpw = "1234";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Connection connect = null;
		
		// �����ͺ��̽� ����
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // Class.forName("oracle.jdbc.driver.OracleDriver") ���� ����
			connect = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcUserpw);
			
			// SQL ����
			String sql = "SELECT * FROM PRODUCTS";
			PreparedStatement ps = connect.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			// ��ǰ����� ������ ��ٱ��� ���� ArrayList ����
			ArrayList<Product> productList = new ArrayList<>();
			
			while(rs.next()) {
				int productId = rs.getInt("product_id");
				String productName = rs.getString("product_name");
				String category = rs.getString("category");
				double price = rs.getDouble("price");
				int stockQuantity = rs.getInt("stock_quantity");
				
				Product product = new Product(productId, productName, category, price, stockQuantity);
				// productList�� ��ǰ���� �ϳ��� Add �ؼ� �־���
				productList.add(product);
			}
			
			// JSP ��ǰ ��� �������� ��ǰ ����� ��������!
			request.setAttribute("productList", productList);
			request.getRequestDispatcher("/productList.jsp").forward(request, response);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
	}
}