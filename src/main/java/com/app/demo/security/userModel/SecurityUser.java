package com.app.demo.security.userModel;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "security_user")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class SecurityUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private Role role;
    @Column(name = "token")
    @Nullable
    private String token;

}
