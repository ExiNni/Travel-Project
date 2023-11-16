package com.kh.board;

public class BoardComment {
	private	 String user_id;
	private	 String review_content;
	private  String review_writer;
	private  int review_number;
	private int POST_NUMBER;
	private int review_date;
	private int review_like;
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getReview_content() {
		return review_content;
	}

	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}

	public String getReview_writer() {
		return review_writer;
	}

	public void setReview_writer(String review_writer) {
		this.review_writer = review_writer;
	}

	public int getReview_number() {
		return review_number;
	}

	public void setReview_number(int review_number) {
		this.review_number = review_number;
	}

	public int getPOST_NUMBER() {
		return POST_NUMBER;
	}

	public void setPOST_NUMBER(int pOST_NUMBER) {
		POST_NUMBER = pOST_NUMBER;
	}

	public int getReview_date() {
		return review_date;
	}

	public void setReview_date(int review_date) {
		this.review_date = review_date;
	}

	public int getReview_like() {
		return review_like;
	}

	public void setReview_like(int review_like) {
		this.review_like = review_like;
	}

	public BoardComment(String user_id, String review_content, String review_writer, int review_number, int POST_NUMBER,int review_date,int review_like) {
		this.user_id=user_id;
		this.review_content = review_content;
		this.review_writer = review_writer;
		this.review_number = review_number;
		this.POST_NUMBER = POST_NUMBER;
		this.review_date = review_date;
		this.review_like = review_like;
	}

	public BoardComment(int review_number2, int pOST_NUMBER2, int review_date2, int review_like2, String review_writer2,
			String review_content2) {
		// TODO Auto-generated constructor stub
	}
	
	
}
