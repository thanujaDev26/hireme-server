package com.mobile_application.hireme.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    @Id
    private Long id;
    private String title;
    private int releaseYear;
    private String genre;
    @ManyToOne
    private Director director;
}
