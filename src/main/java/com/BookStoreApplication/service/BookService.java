package com.BookStoreApplication.service;

import com.BookStoreApplication.dto.BookDTO;
import com.BookStoreApplication.exception.BookStoreException;
import com.BookStoreApplication.model.Book;
import com.BookStoreApplication.repository.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService{

    @Autowired
    BookStoreRepository bookStoreRepository;

    @Override
    public Book createBook(BookDTO bookDTO) {
        Book newBook = new Book(bookDTO);
          return  bookStoreRepository.save(newBook);

    }

    @Override
    public Optional<Book> getBookDataById(int BookId) {
        Optional<Book> getBook=bookStoreRepository.findById(BookId);
        if(getBook.isEmpty()){
            throw new BookStoreException("Book Store Details for id not found");
        }
        return getBook;

    }

    @Override
    public List<Book> getAllBookData() {
        List<Book> getBooks=bookStoreRepository.findAll();
        return getBooks;
    }

    @Override
    public Book updateRecordById(Integer BookId, BookDTO bookDTO) {

        Optional<Book> updateBook = bookStoreRepository.findById(BookId);
        if (updateBook.isEmpty()) {
            throw new BookStoreException("Book record does not found");
        } else {
            Book updateUser = new Book(BookId, bookDTO);
            bookStoreRepository.save(updateUser);
            return updateUser;

        }
    }


    @Override
    public Object deleteRecordByToken(int BookId) {
        Optional<Book> newBook = bookStoreRepository.findById(BookId);
        if (newBook.isEmpty()) {
            throw new BookStoreException("Book record does not found");
        } else {
           bookStoreRepository.deleteById(BookId);
        }
        return null;
    }


    @Override
    public Optional<Book> getBookByName(String bookName) {
        Optional<Book> findBook= Optional.ofNullable(bookStoreRepository.findByBookName(bookName));
        if(findBook.isEmpty()){
            throw new BookStoreException(" Details for provided Book is not found");
        }
        return findBook;
    }

    @Override
    public List<Book> sortedListOfBooksInAscendingOrder() {
        List<Book> getSortedList=  bookStoreRepository.getSortedListOfBooksInAsc();
        return getSortedList;
    }

    @Override
    public List<Book> sortedListOfBooksInDescendingOrder() {
        List<Book> getSortedListInDesc=  bookStoreRepository.getSortedListOfBooksInDesc();
        return getSortedListInDesc;
    }


}
