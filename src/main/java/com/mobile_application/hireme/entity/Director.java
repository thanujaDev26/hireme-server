package com.mobile_application.hireme.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Director {

    @Id
    private String id;
    @Column(length = 50, nullable = false)
    private String lname;
    private String fname;
    private String phoneNumber;
    private String bio;
    @OneToMany(mappedBy = "director",cascade = CascadeType.ALL)
    private List<Film> films;

    @OneToOne
    private User user;



}
