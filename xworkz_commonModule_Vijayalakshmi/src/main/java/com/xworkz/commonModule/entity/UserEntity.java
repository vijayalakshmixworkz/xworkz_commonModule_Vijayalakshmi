package com.xworkz.commonModule.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@Table(name="signup_info")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="user_name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="alternative_email")
    private String alternative_email;
    @Column(name="phone")
    private String phone;
    @Column(name="alternative_phone")
    private String alternative_phone;
    @Column(name="location")
    private String location;
    @Column(name="password")
    private String password;
}
