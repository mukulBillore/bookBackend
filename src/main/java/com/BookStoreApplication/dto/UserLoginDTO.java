package com.BookStoreApplication.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
@Data
public class UserLoginDTO {
   @Email
    private String email;
   @NotEmpty(message = "Password cant be null")
    private String password;
   public UserLoginDTO(String email,String password){
       this.email=email;
       this.password=password;
       
   }
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
