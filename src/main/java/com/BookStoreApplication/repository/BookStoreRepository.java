package com.BookStoreApplication.repository;

import com.BookStoreApplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface BookStoreRepository extends JpaRepository<Book,Integer> {

    @Query(value = "select * from book where book_name = :bookName", nativeQuery = true)
    Book findByBookName(String bookName);


    @Query(value = "select * from book order by book_name", nativeQuery = true)
    List<Book> getSortedListOfBooksInAsc();

    @Query(value = "select * from book order by book_name desc", nativeQuery = true)
    List<Book> getSortedListOfBooksInDesc();
}
