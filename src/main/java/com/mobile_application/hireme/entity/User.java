package com.mobile_application.hireme.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String password;

    @OneToOne(mappedBy = "user")
    private Director director;

    @OneToOne(mappedBy = "user")
    private Actor actor;

    @OneToOne
    @JoinTable(
            name = "user_roles_with_users",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private UserRole role;
}
