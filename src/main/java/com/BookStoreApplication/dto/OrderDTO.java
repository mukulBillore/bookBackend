package com.BookStoreApplication.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
@Data
public class OrderDTO {
    private Integer quantity;
    @NotEmpty(message="Please provide address")
    private String address;
    private Integer price;
    private Integer userId;
    private Integer bookId;
    private boolean cancel;
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public boolean isCancel() {
		return cancel;
	}
	public void setCancel(boolean cancel) {
		this.cancel = cancel;
	}
	public OrderDTO(Integer quantity, @NotEmpty(message = "Please provide address") String address, Integer userId,
			Integer bookId, boolean cancel,Integer price) {
		super();
		this.quantity = quantity;
		this.address = address;
		this.userId = userId;
		this.bookId = bookId;
		this.cancel = cancel;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public OrderDTO() {
		super();
	}
	
    
}
