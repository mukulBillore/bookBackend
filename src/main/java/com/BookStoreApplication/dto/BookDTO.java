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


}
