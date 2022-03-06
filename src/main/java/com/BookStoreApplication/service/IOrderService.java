package com.BookStoreApplication.service;

import com.BookStoreApplication.dto.OrderDTO;
import com.BookStoreApplication.model.Order;

import java.util.List;

public interface IOrderService {

    public Order insertOrder(OrderDTO orderdto);

    public List<Order> getAllOrderRecords();

    public Order getOrderRecord(Integer id);

    public Order updateOrderRecord(Integer id, OrderDTO dto);

    public Order deleteOrderRecord(Integer id);
}
