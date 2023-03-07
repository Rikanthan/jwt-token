package com.example.jwttokengeneration.repository;

import com.example.jwttokengeneration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
