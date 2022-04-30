package com.BookStoreApplication.model;

import com.BookStoreApplication.dto.UserDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class UserRegistration {
    

	@Id
    @GeneratedValue
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String password;
    
    public UserRegistration() {
		super();
	}
    

    public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRegistration(UserDTO userDTO){
        this.userId=getUserId();
        this.firstName= userDTO.getFirstName();
        this.lastName= userDTO.getLastName();
        this.address= userDTO.getAddress();
        this.email= userDTO.getEmail();
        this.password= userDTO.getPassword();
    }
    public UserRegistration(Integer userId,UserDTO userDTO){
        this.userId=userId;
        this.firstName= userDTO.getFirstName();
        this.lastName= userDTO.getLastName();
        this.address= userDTO.getAddress();
        this.email= userDTO.getEmail();
        this.password= userDTO.getPassword();
    }

    public UserRegistration(String email_id, UserDTO userDTO) {
        this.email=email_id;
        this.firstName= userDTO.getFirstName();
        this.lastName= userDTO.getLastName();
        this.address=userDTO.getAddress();
        this.password= userDTO.getPassword();
    }

    public UserRegistration(UserRegistration user) {
        this.userId=userId;
        this.firstName= user.getFirstName();
        this.lastName= user.getLastName();
        this.address= user.getAddress();
        this.email= user.getEmail();
        this.password= user.getPassword();
    
    }


	public void updateUser(UserDTO user) {
        this.firstName= user.getFirstName();
        this.lastName=user.getLastName();
        this.email= user.getEmail();
        this.address=user.getAddress();
        this.password=user.getPassword();
    }
}
