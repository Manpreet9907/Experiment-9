package com.AML3A.JWT.Auth.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.AML3A.JWT.Auth.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}