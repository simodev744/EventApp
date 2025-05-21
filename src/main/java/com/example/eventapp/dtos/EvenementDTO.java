package com.example.eventapp.dtos;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EvenementDTO {
    private Long id;
    private String titre;
    private LocalDate date;
    private String lieu;
    private String categorie;
    private String description;
}
