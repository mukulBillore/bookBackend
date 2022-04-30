package com.BookStoreApplication.service;

import com.BookStoreApplication.dto.BookDTO;
import com.BookStoreApplication.model.Book;
import java.util.List;
import java.util.Optional;

public interface IBookService {
    Book createBook(BookDTO bookDTO);

    Book getBookDataById(int BookId);

    List<Book> getAllBookData();

    Book updateRecordById(Integer BookId, BookDTO bookDTO);

    Object deleteRecordByToken(int BookId);

    List<Book> getBookByName(String bookName);

    List<Book> sortedListOfBooksInAscendingOrder();

    List<Book> sortedListOfBooksInDescendingOrder();

    Book updateQuantity(Integer id, Integer quantity);
     
}
