package com.tanish.spring_boot_rest.Repository;


import com.tanish.spring_boot_rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
