package com.BookStoreApplication.repository;

import com.BookStoreApplication.model.Order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order,Integer> {

	@Query(value = "SELECT * FROM mybookstore.order;", nativeQuery = true)
	List<Order> listOrder();
}
