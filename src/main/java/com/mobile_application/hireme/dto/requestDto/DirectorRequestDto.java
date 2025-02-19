package com.mobile_application.hireme.dto.requestDto;

import com.mobile_application.hireme.entity.Film;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class DirectorRequestDto {

    private String id;

    private String lname;

    private String fname;

    private String phoneNumber;

    private String bio;

    private List<Film> films;
}
