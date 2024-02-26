package com.nickz.todolistv300.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

/*
  NOT READY
 */

// TODO: 2/27/2024  
@Data
@ToString(exclude = "userChats")
@EqualsAndHashCode(of = "username")
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Entity
//@Table(name = "users")

public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;
    private String password;

    private LocalDate birthDate;

    private String firstname;

    private String lastname;
    private String image;

    @Enumerated(EnumType.STRING)
    private Role role;



}
