package com.example.eventapp.models;

import com.example.eventapp.models.Utilisateur;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Administrateur extends Utilisateur {
    // You can add additional fields specific to Administrateur here
}
