<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="com.kh.product.Product" %>
<%@ page import="com.kh.product.ProductDAO" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>��ǰ �� ������</title>
    <style>
    	h1{
    	text-align: center;
    	background-color: black;
    	color: white;
    	padding: 40px;
    	}
    	
    	p{
    	text-align: center;
    	}
    </style>
</head>
<body>

<%
    ProductDAO productDAO = new ProductDAO();

    String productIdValue = request.getParameter("productId");
    int productId = Integer.parseInt(productIdValue);

    Product product = productDAO.getProductId(productId);
%>
    <h1>��ǰ �� ����</h1>
    <p>��ǰ ID: <%= product.getProductId() %></p>
    <p>��ǰ �̸�: <%= product.getProductName() %></p>
    <p>��ǰ ī�װ���: <%= product.getCategory() %></p>
    <p>��ǰ ����: <%= product.getPrice() %></p>
    <p>��ǰ ���: <%= product.getStockQuantity() %></p>
</body>
</html>