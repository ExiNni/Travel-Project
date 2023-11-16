package com.kh.product;

import java.sql.Timestamp;

public class ProductComment {

	private int commentId;
	private int productId;
	private String commenterName;
	private String commentText;
	private Timestamp commentDate;
	
	// 값을 저장하고 저장된 내용을 보내기 위한 생성자

	public ProductComment() {
		super();
	}

	public ProductComment(int commentId, int productId, String commenterName, String commentText,
			Timestamp commentDate) {
		super();
		this.commentId = commentId;
		this.productId = productId;
		this.commenterName = commenterName;
		this.commentText = commentText;
		this.commentDate = commentDate;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setCommenterName(String commenterName) {
		this.commenterName = commenterName;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public void setCommentDate(Timestamp commentDate) {
		this.commentDate = commentDate;
	}

	public int getCommentId() {
		return commentId;
	}

	public int getProductId() {
		return productId;
	}

	public String getCommenterName() {
		return commenterName;
	}

	public String getCommentText() {
		return commentText;
	}

	public Timestamp getCommentDate() {
		return commentDate;
	}

}
