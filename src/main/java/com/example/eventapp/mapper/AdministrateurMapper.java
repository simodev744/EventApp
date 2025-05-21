package com.example.eventapp.mapper;


import com.example.eventapp.dtos.AdministrateurDTO;
import com.example.eventapp.models.Administrateur;

public class AdministrateurMapper {

    public static AdministrateurDTO toDTO(Administrateur admin) {
        if (admin == null) return null;
        AdministrateurDTO dto = new AdministrateurDTO();
        dto.setId(admin.getId());
        dto.setNom(admin.getNom());
        dto.setEmail(admin.getEmail());
        dto.setRole(admin.getRole());
        return dto;
    }

    public Administrateur toEntity(AdministrateurDTO dto) {
        if (dto == null) return null;
        Administrateur admin = new Administrateur();
        admin.setId(dto.getId());
        admin.setNom(dto.getNom());
        admin.setEmail(dto.getEmail());
        admin.setRole(dto.getRole());
        return admin;
    }
}
