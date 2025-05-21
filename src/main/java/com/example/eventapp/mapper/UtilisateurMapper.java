package com.example.eventapp.mapper;


import com.example.eventapp.dtos.UtilisateurDTO;
import com.example.eventapp.models.Utilisateur;

public class UtilisateurMapper {

    public static UtilisateurDTO toDTO(Utilisateur user) {
        if (user == null) return null;
        UtilisateurDTO dto = new UtilisateurDTO();
        dto.setId(user.getId());
        dto.setNom(user.getNom());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole());
        return dto;
    }
}
