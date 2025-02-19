package com.mobile_application.hireme.dto.requestDto;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ActorRequestDto {

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

    private String email;

    private String password;


}
