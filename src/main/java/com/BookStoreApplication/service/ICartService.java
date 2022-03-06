package com.BookStoreApplication.service;

import com.BookStoreApplication.dto.CartDTO;
import com.BookStoreApplication.model.Cart;
import java.util.List;
import java.util.Optional;

public interface ICartService {

    List<Cart> getCartDetails();

    Optional<Cart> getCartDetailsById(Integer cartId);

    Optional<Cart> deleteCartItemById(Integer cartId);

    Cart updateRecordById(Integer cartId, CartDTO cartDTO);

    Cart insertItems(CartDTO cartdto);

    Cart updateQuantity(Integer id, Integer quantity);
}
