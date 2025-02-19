package com.mobile_application.hireme.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRole {

    @Id
    private String id;

    private String role;

    private String description;

    @OneToOne
    private User user;
}
