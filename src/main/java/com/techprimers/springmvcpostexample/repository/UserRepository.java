package com.techprimers.springmvcpostexample.repository;

import com.techprimers.springmvcpostexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
