package com.example.security.Securityapp.repsoitory;


import com.example.security.Securityapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
}
