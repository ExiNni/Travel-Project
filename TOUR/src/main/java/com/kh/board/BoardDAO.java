package com.kh.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String jdbcUsername = "TRAVEL";
	private static final String jdbcPassword = "TRAVEL1234";
	
	public BoardDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<BoardDTO> getAllBoards() {
		List<BoardDTO> boards = new ArrayList<>();
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			BoardDTO bd = null;
			String sql = "SELECT * FROM boards";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				bd = new BoardDTO();
				bd.setPost_number(rs.getInt("post_number"));
				bd.setUser_id(rs.getString("user_id"));
				bd.setCity_name(rs.getString("city_name"));
				bd.setTitle(rs.getString("title"));
				bd.setContent(rs.getString("content"));
				bd.setPost_time(rs.getString("post_time"));
				bd.setCategory(rs.getString("category"));
				boards.add(bd);
			
			}
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boards;
	}
		
	public BoardDTO getBoard(int post_number) {
		
		BoardDTO bd = null;
		
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = "SELECT user_id, city_name, title, content, post_time, category  FROM boards WHERE post_number = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, post_number);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				bd = new BoardDTO();
				bd.setUser_id(rs.getString("user_id"));
				bd.setCity_name(rs.getString("city_name"));
				bd.setTitle(rs.getString("title"));
				bd.setContent(rs.getString("content"));
				bd.setPost_time(rs.getString("post_time"));
				bd.setCategory(rs.getString("category"));
			}
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bd;
	
}
	
	
	public BoardDTO getCity_name(int city_name) {
		BoardDTO board = null;
		
		return board;
	}
	 public void addComment(BoardComment comment) {
    	 try {
			Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			 String sql = "INSERT INTO product_comments (review_number, POST_NUMBER, user_id, review_writer, review_content,review_date,review_like) VALUES (?, ?, ?, ?, ?, ?, ? )";
			 PreparedStatement ps = connection.prepareStatement(sql);
			 ps.setInt(1, comment.getReview_number());
			 ps.setInt(2, comment.getPOST_NUMBER());
			 ps.setString(3,  comment.getUser_id());
			 ps.setString(4, comment.getReview_writer());
			 ps.setString(5, comment.getReview_content());
			 ps.setInt(6, comment.getReview_date());
			 ps.setInt(7, comment.getReview_like());
						 	
			 ps.executeUpdate();
    	 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
     }
    
     public ArrayList<BoardComment> getCommentsByProductId(String user_id){
    	 ArrayList<BoardComment> boardList = new ArrayList<>();
    	 try {
			Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = "SELECT * FROM board_comments WHERE user_id= ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, user_id);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()){
				int review_number = resultSet.getInt("review_number");
				int POST_NUMBER = resultSet.getInt("POST_NUMBER");
				int Review_date = resultSet.getInt("Review_date");
				int Review_like = resultSet.getInt("Review_like");
				String Review_writer = resultSet.getString("Review_writer");
				String Review_content = resultSet.getString("Review_content");
			
				
				
				BoardComment comment = new BoardComment(review_number,POST_NUMBER,Review_date,Review_like,Review_writer,Review_content);
				boardList.add(comment);
			}
    	 } catch (SQLException e) {
			
			e.printStackTrace();
		}

    	 return boardList;
     }
	
}
