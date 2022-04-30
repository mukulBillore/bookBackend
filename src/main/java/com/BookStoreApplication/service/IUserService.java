package com.BookStoreApplication.service;


import com.BookStoreApplication.dto.UserDTO;
import com.BookStoreApplication.model.UserRegistration;
import java.util.List;

import javax.validation.Valid;

public interface IUserService {

    UserRegistration addUser(UserDTO userDTO);

    List<UserRegistration> getAllUsers();

    String loginUser(String email_id, String password);

    int loginUserTest(String email_id, String password);

    Object getUserById(String token);

    String forgotPassword(String email, String password);

    Object getUserByEmailId(String emailId);

    UserRegistration updateUser(String email, UserDTO userDTO);

    String getToken(String email);

    List<UserRegistration> getAllUserDataByToken(String token);

    UserRegistration updateRecordByToken(String token, UserDTO userDTO);

	Integer loginUserId(String email_id);

	UserRegistration getUserByID(int id);

	UserRegistration updateRecordById(Integer id, @Valid UserDTO userDTO);
}
