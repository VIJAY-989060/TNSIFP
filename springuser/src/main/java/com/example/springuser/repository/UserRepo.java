package com.example.springuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springuser.entity.User;

public interface UserRepo extends JpaRepository<User,Long> {

}
