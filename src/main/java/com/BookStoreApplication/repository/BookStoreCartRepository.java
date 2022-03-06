package com.BookStoreApplication.repository;

import com.BookStoreApplication.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStoreCartRepository extends JpaRepository<Cart,Integer> {
}
