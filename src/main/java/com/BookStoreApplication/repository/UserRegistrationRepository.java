package com.BookStoreApplication.repository;

import com.BookStoreApplication.model.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration,Integer> {
    @Query(value = "SELECT * FROM user_registration where email=:email_Id", nativeQuery = true)
    public Optional<UserRegistration> findByEmailid(String email_Id);
}
