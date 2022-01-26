package com.project.foryourskintype.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String password;
    private String phoneNumber;

    public Member(String name,
                  int age,
                  String gender,
                  String email,
                  String password,
                  String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    @OneToMany(mappedBy = "member")
    private List<LikedItem> likedItems = new ArrayList<>();
}
