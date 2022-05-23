package com.example.myweb.repository;

import com.example.myweb.model.Board;
import com.example.myweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
