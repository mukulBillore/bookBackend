package com.BookStoreApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Wishlist {

	  @Id
      @GeneratedValue
	    private Integer wishlistId;

	    @ManyToOne
	    @JoinColumn(name="userId")
	    private UserRegistration user;
	    @ManyToOne
	    @JoinColumn(name="bookId")
	    private Book book;

	    public Wishlist() {

	    	
	    	
	    }

	    public Integer getWishlistId() {
			return wishlistId;
		}

		public void setWishlistId(Integer wishlistId) {
			this.wishlistId = wishlistId;
		}

		public UserRegistration getUser() {
			return user;
		}

		public void setUser(UserRegistration user) {
			this.user = user;
		}

		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}

		public Wishlist(UserRegistration user, Book book) {
	        super();
	        this.user = user;
	        this.book = book;
	    }


}
