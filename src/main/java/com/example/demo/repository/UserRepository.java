package com.example.demo.repository;

import com.example.demo.model.UsersVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UsersVO,String> {
    List<UsersVO> getAll();
}
