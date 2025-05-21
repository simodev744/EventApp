package com.example.eventapp.repository;

import com.example.eventapp.models.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    // Recherche personnalisée, par exemple
    List<Evenement> findByDate(LocalDate date);
    List<Evenement> findByLieuContainingIgnoreCase(String lieu);
    List<Evenement> findByCategorie(String categorie);
}
