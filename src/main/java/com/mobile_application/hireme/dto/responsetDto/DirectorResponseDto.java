package com.mobile_application.hireme.dto.responsetDto;

import com.mobile_application.hireme.entity.Film;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class DirectorResponseDto {

    private String id;

    private String lname;

    private String fname;

    private String phoneNumber;

    private String bio;

    private List<Film> films;
}
