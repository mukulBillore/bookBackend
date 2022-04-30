package com.BookStoreApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStoreApplication.dto.WishListDTO;
import com.BookStoreApplication.exception.BookStoreException;
import com.BookStoreApplication.model.Book;
import com.BookStoreApplication.model.UserRegistration;
import com.BookStoreApplication.model.Wishlist;
import com.BookStoreApplication.repository.BookStoreRepository;
import com.BookStoreApplication.repository.UserRegistrationRepository;
import com.BookStoreApplication.repository.WishListRepository;
@Service
public class WishlistService {

	
	@Autowired
    private WishListRepository WishlistRepo;

    @Autowired
    private UserRegistrationRepository userRepo;

    @Autowired
    private BookStoreRepository bookRepo;

    public Wishlist addToWishlist(WishListDTO dto) {
        // TODO Auto-generated method stub
        Optional<UserRegistration> user = userRepo.findById(dto.getUserId());
        Optional<Book> book = bookRepo.findById(dto.getBookId());
        if(user.isPresent() && book.isPresent()) {
            Wishlist newWishList = new Wishlist(user.get(),book.get());
            WishlistRepo.save(newWishList);
            return newWishList;
        }
        else {
            throw new BookStoreException("User or Book doesn't exists");
        }
    }

    
    public List<Wishlist> getAllWishlists() {
        List<Wishlist> list = WishlistRepo.findAll();
        return list;
    }
    public List<Wishlist> getWishlistRecordById(Integer id){
        List<Wishlist> list = WishlistRepo.findByWishlistId(id);
        if(list.isEmpty()) {
            throw new BookStoreException("Wishlist doesn't exists for id "+id);
        }
        else {
            return list;
        }
    }

    public List<Wishlist> getWishlistRecordByBookId(Integer bookId) {
        List<Wishlist> list = WishlistRepo.findByBookId(bookId);
        if(list.isEmpty()) {
            return null;
        }
        else {
            return list;
        }
    }
    public List<Wishlist> getWishlistRecordByUserId(Integer userId) {
        List<Wishlist> list = WishlistRepo.findByUserId(userId);
    return list;

    }

    public Wishlist deleteWishlistRecordById(Integer Id) {
        Optional<Wishlist> list = WishlistRepo.findById(Id);
        WishlistRepo.deleteById(Id);
        return list.get();
    }
}
