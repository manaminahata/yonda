package com.example.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

public class BookRegistrationForm {
	
	@NotBlank(message = "書籍名を入力してください")
	private String bookName;
	@PositiveOrZero(message = "カテゴリーを選択してください")
	private Integer bookCategoryId;
	private Integer bookPrice;
	@Positive(message = "ページ数を入力してください")
	private Integer bookPage;
	private String bookImg;
	
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
	public String getBookImg() {
		return bookImg;
	}
	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}
	
	@Override
	public String toString() {
		return "BookRegistrationForm [bookName=" + bookName + ", bookCategoryId=" + bookCategoryId + ", bookPrice="
				+ bookPrice + ", bookPage=" + bookPage + ", bookImg=" + bookImg + "]";
	}
	
}
