package com.example.eventapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity

@ToString
public class Evenement {

    public Long getId() {
        return id;
    }

    public Evenement() {
    }


    public Evenement(Long id, String titre, LocalDate date, String lieu, String categorie, String description) {
        this.id = id;
        this.titre = titre;
        this.date = date;
        this.lieu = lieu;
        this.categorie = categorie;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;

    private LocalDate date;

    private String lieu;

    private String categorie;

    @Column(length = 1000)
    private String description;
}
