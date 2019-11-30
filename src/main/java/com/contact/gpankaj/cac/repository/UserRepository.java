package com.contact.gpankaj.cac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contact.gpankaj.cac.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findUserByUsername(String username);
}
