package com.BookStoreApplication.repository;

import com.BookStoreApplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface BookStoreRepository extends JpaRepository<Book,Integer> {

    @Query(value = "select * from book where book_name like :bookName%", nativeQuery = true)
    List<Book> findByBookName(String bookName);


    @Query(value = "select * from book order by price", nativeQuery = true)
    List<Book> getSortedListOfBooksInAsc();

    @Query(value = "select * from book order by price desc", nativeQuery = true)
    List<Book> getSortedListOfBooksInDesc();
}
