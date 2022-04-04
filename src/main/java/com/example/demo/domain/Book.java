package com.example.demo.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;


import lombok.Data;

/**
 * booksテーブルのためのドメインクラス
 * @author manami
 *
 */
@Data
public class Book implements Serializable{
	
	private static final long serialVersionUID = -2921497769927755763L;
	private Integer bookId;
	private String bookName;
	private Integer bookCategoryId;
	private Integer bookPrice;
	private Integer bookPage;
	private Integer bookCurrentPage;
	private String bookImgName;
	private byte[] bookImg;
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
	public String getBookImgName() {
		return bookImgName;
	}
	public void setBookImgName(String bookImgName) {
		this.bookImgName = bookImgName;
	}
	public byte[] getBookImg() {
		return bookImg;
	}
	public void setBookImg(byte[] bookImg) {
		this.bookImg = bookImg;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCategoryId=" + bookCategoryId
				+ ", bookPrice=" + bookPrice + ", bookPage=" + bookPage + ", bookCurrentPage=" + bookCurrentPage
				+ ", bookImgName=" + bookImgName + ", bookImg=" + Arrays.toString(bookImg) + ", bookUserId="
				+ bookUserId + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
	}

}
