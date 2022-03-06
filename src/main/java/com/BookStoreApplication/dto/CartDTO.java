package com.BookStoreApplication.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CartDTO {
    private Integer userId;
    private Integer BookId;
    @NotNull(message="Book quantity yet to be provided")
    private Integer quantity;
}
