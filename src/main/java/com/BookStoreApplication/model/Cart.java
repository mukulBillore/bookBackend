package com.BookStoreApplication.model;
import com.BookStoreApplication.dto.CartDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
public class Cart {
    @Id
    @GeneratedValue
    private Integer cartId;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserRegistration user;
    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book book;
    private Integer quantity;

    public Cart(Integer cartId, Integer quantity, Book book, UserRegistration user) {
        super();
        this.cartId = cartId;
        this.quantity = quantity;
        this.book = book;
        this.user = user;
    }//

    public Cart(Integer quantity, Book book, UserRegistration user) {
        super();
        this.quantity = quantity;
        this.book = book;
        this.user = user;
    }

    public Cart() {
        super();
    }

	public Integer getCartId() {
		return cartId;
	}

	public void setCartID(Integer cartID) {
		this.cartId = cartId;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
}
