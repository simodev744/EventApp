package com.example.eventapp.models;

import com.example.eventapp.models.Utilisateur;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@ToString(callSuper = true)
public class Administrateur extends Utilisateur {

}
