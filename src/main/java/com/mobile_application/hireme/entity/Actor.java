package com.mobile_application.hireme.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Actor {

    @Id
    private String id;

    private String fname;

    private String lname;

    private int age;

    private double height;

    private double weight;

    private String gender;

    private String bio;

    private String tanColor;

    private String address;

    private String phone;

    @OneToOne
    private User user;


}
