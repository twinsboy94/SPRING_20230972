package com.example.demo.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 1씩 증가
    @Column(name = "id", updatable = false) // 수정 불가
    private Long id;

    @Column(name = "name", nullable = false) // null x
    private String name = "";

    @Column(name = "email", unique = true, nullable = false) // 중복 불가, null x
    private String email = "";

    @Column(name = "password", nullable = false)
    private String password = "";
    @Column(name = "age", nullable = false)
    private String age = "";

    @Column(name = "mobile", nullable = false)
    private String mobile = "";

    @Column(name = "address", nullable = false)
    private String address = "";

    @Builder
    public Member(String name, String email, String password, String age, String mobile, String address){
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
    }
}
