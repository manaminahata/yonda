package com.example.demo.domain;

import java.sql.Timestamp;


/**
 * booksテーブルのためのドメインクラス
 * @author manami
 *
 */
public class Book {

	private Integer bookId;
	private String bookName;
	private Integer bookCategoryId;
	private Integer bookPrice;
	private Integer bookPage;
	private Integer bookCurrentPage;
	private String bookImage;
	private Integer bookUserId;
	private Timestamp createAt;
	private Timestamp updateAt;
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookCategoryId() {
		return bookCategoryId;
	}
	public void setBookCategoryId(Integer bookCategoryId) {
		this.bookCategoryId = bookCategoryId;
	}
	public Integer getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Integer getBookPage() {
		return bookPage;
	}
	public void setBookPage(Integer bookPage) {
		this.bookPage = bookPage;
	}
	public Integer getBookCurrentPage() {
		return bookCurrentPage;
	}
	public void setBookCurrentPage(Integer bookCurrentPage) {
		this.bookCurrentPage = bookCurrentPage;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public Integer getBookUserId() {
		return bookUserId;
	}
	public void setBookUserId(Integer bookUserId) {
		this.bookUserId = bookUserId;
	}
	public Timestamp getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}
	public Timestamp getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}
		
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCategoryId=" + bookCategoryId
				+ ", bookPrice=" + bookPrice + ", bookPage=" + bookPage + ", bookCurrentPage=" + bookCurrentPage
				+ ", bookImage=" + bookImage + ", bookUserId=" + bookUserId + ", createAt=" + createAt + ", updateAt="
				+ updateAt + "]";
	}
}
