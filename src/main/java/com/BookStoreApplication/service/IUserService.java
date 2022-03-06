package com.BookStoreApplication.service;


import com.BookStoreApplication.dto.UserDTO;
import com.BookStoreApplication.model.UserRegistration;
import java.util.List;

public interface IUserService {

    String addUser(UserDTO userDTO);

    List<UserRegistration> getAllUsers();

    String loginUser(String email_id, String password);

    Object getUserById(String token);

    String forgotPassword(String email, String password);

    Object getUserByEmailId(String emailId);

    UserRegistration updateUser(String email, UserDTO userDTO);

    String getToken(String email);

    List<UserRegistration> getAllUserDataByToken(String token);

    UserRegistration updateRecordByToken(String token, UserDTO userDTO);
}
