package com.example.eventapp.mapper;

import com.example.eventapp.dtos.EvenementDTO;
import com.example.eventapp.models.Evenement;

public class EvenementMapper {

    public static EvenementDTO toDTO(Evenement evenement) {
        if (evenement == null) return null;
        return new EvenementDTO(
                evenement.getId(),
                evenement.getTitre(),
                evenement.getDate(),
                evenement.getLieu(),
                evenement.getCategorie(),
                evenement.getDescription()
        );
    }

    public static Evenement toEntity(EvenementDTO dto) {
        if (dto == null) return null;
        Evenement evenement = new Evenement();
        evenement.setId(dto.getId());
        evenement.setTitre(dto.getTitre());
        evenement.setDate(dto.getDate());
        evenement.setLieu(dto.getLieu());
        evenement.setCategorie(dto.getCategorie());
        evenement.setDescription(dto.getDescription());
        return evenement;
    }
}
