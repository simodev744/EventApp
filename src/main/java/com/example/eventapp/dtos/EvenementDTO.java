package com.example.eventapp.dtos;

import lombok.*;
import java.time.LocalDate;

@ToString
public class EvenementDTO {
    private Long id;
    private String titre;
    private LocalDate date;
    private String lieu;

    public EvenementDTO() {
    }

    public EvenementDTO(Long id, String titre, LocalDate date, String lieu, String categorie, String description) {
        this.id = id;
        this.titre = titre;
        this.date = date;
        this.lieu = lieu;
        this.categorie = categorie;
        this.description = description;
    }

    private String categorie;

    public Long getId() {
        return id;
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

    private String description;
}
