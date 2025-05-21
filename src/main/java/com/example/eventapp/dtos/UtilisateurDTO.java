package com.example.eventapp.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilisateurDTO {
    private Long id;
    private String nom;
    private String email;
    private String role;
}
