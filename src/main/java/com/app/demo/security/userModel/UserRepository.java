package com.app.demo.security.userModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<SecurityUser, Long> {

    SecurityUser findByUsername(@Param("username") String username);

//    SecurityUser findByToken(@Param("token") String token);

}
