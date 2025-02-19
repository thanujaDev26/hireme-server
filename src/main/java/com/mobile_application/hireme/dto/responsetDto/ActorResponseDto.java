package com.mobile_application.hireme.dto.responsetDto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ActorResponseDto {

    private String lname;

    private int age;

    private double height;

    private double weight;

    private String gender;

    private String bio;

    private String tanColor;

    private String address;

    private String phone;
}
