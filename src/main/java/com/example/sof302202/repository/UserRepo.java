package com.example.sof302202.repository;

import com.example.sof302202.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// tương tác với có sở dữ liệu
//
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
