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
    private Integer cartID;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserRegistration user;
    @ManyToOne
    @JoinColumn(name = "BookId")
    private Book book;
    private Integer quantity;

    public Cart(Integer cartID, Integer quantity, Book book, UserRegistration user) {
        super();
        this.cartID = cartID;
        this.quantity = quantity;
        this.book = book;
        this.user = user;
    }

    public Cart(Integer quantity, Book book, UserRegistration user) {
        super();
        this.quantity = quantity;
        this.book = book;
        this.user = user;
    }

    public Cart() {
        super();
    }
}
