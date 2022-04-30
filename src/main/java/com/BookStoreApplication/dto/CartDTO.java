package com.BookStoreApplication.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CartDTO {
    private Integer userId;
    private Integer BookId;
    @NotNull(message="Book quantity yet to be provided")
    private Integer quantity;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getBookId() {
		return BookId;
	}
	public void setBookId(Integer bookId) {
		BookId = bookId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
    

}
