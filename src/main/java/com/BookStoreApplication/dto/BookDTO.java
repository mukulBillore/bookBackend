package com.BookStoreApplication.dto;

import lombok.Data;


import javax.validation.constraints.NotNull;

@Data
public class BookDTO {
    
	@NotNull(message = "book name cant be null")
    private String bookName;
    @NotNull(message = "author name cant be null")
    private String authorName;
    @NotNull(message = "book description cant be null")
    private String bookDescription;
    @NotNull(message = "book image cant be null")
    private String bookImage;
    @NotNull (message = "price cant be empty")
    private Integer price;
    @NotNull(message = "Quantity cant be empty")
    private Integer quantity;
	public String getBookName() {
		return bookName;
	}
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


}
	