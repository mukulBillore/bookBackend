package com.BookStoreApplication.service;

import com.BookStoreApplication.dto.OrderDTO;
import com.BookStoreApplication.exception.BookStoreException;
import com.BookStoreApplication.model.Book;
import com.BookStoreApplication.model.Order;
import com.BookStoreApplication.model.UserRegistration;
import com.BookStoreApplication.repository.BookStoreRepository;
import com.BookStoreApplication.repository.OrderRepository;
import com.BookStoreApplication.repository.UserRegistrationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository orderRepo;
    @Autowired
    private BookStoreRepository bookRepo;
    @Autowired
    private UserRegistrationRepository userRepo;
//  book.get().setQuantity(book.get().getQuantity() - orderdto.getQuantity());
    public Order insertOrder(OrderDTO orderdto) {
        Optional<Book> book = bookRepo.findById(orderdto.getBookId());
        Optional<UserRegistration> user = userRepo.findById(orderdto.getUserId());
        if (book.isPresent() && user.isPresent()) {  	
            if (orderdto.getQuantity()< book.get().getQuantity()) {
            System.out.println("The BOOK PRICE IS :>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> "+book.get().getPrice());
                Order newOrder = new Order(book.get().getPrice(),orderdto.getQuantity(), orderdto.getAddress(), book.get(), user.get(), orderdto.isCancel(),book.get().getBookName());
                orderRepo.save(newOrder);
                book.get().setQuantity(book.get().getQuantity() - orderdto.getQuantity());
                return newOrder;
            } else {
                throw new BookStoreException("Requested quantity is not available");
            }
        } else {
            throw new BookStoreException("Book or User doesn't exists");
        }
    }
    public List<Order> getAllOrderRecords() {
        List<Order> orderList = orderRepo.findAll();
        return orderList;
    }
    
//    public List<Order> getAllOrderRecords() {
//        List<Order> orderList = orderRepo.listOrder();
//        return orderList;
//    }

    public Order getOrderRecord(Integer id) {
        Optional<Order> order = orderRepo.findById(id);
        if (order.isEmpty()) {
            throw new BookStoreException("Order Record doesn't exists");
        } else {
            return order.get();
        }
    }

    public Order updateOrderRecord(Integer id, OrderDTO dto) {
        Optional<Order> order = orderRepo.findById(id);
        Optional<Book> book = bookRepo.findById(dto.getBookId())
        		;
        Optional<UserRegistration> user = userRepo.findById(dto.getUserId());
        if (order.isEmpty()) {
            throw new BookStoreException("Order Record doesn't exists");
        } else {
            if (book.isPresent() && user.isPresent()) {
                if (dto.getQuantity() < book.get().getQuantity()) {
                    Order newOrder = new Order(id, dto.getQuantity(), dto.getAddress(), book.get(), user.get(), dto.isCancel(),book.get().getBookName());
                    orderRepo.save(newOrder);
                    return newOrder;
                } else {
                    throw new BookStoreException("Requested quantity is not available");
                }
            } else {
                throw new BookStoreException("Book or User doesn't exists");

            }
        }
    }

    public Order deleteOrderRecord(Integer id) {
        Optional<Order> order = orderRepo.findById(id);
        if (order.isEmpty()) {
            throw new BookStoreException("Order Record doesn't exists");
        } else {
            orderRepo.deleteById(id);
            return order.get();
        }
    }
}
