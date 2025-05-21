package com.example.eventapp.services;

import com.example.eventapp.dtos.AdministrateurDTO;
import com.example.eventapp.mapper.AdministrateurMapper;
import com.example.eventapp.models.Administrateur;
import com.example.eventapp.repository.AdministrateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdministrateurService {

    private final AdministrateurRepository administrateurRepository;

    public AdministrateurService(AdministrateurRepository administrateurRepository) {
        this.administrateurRepository = administrateurRepository;
    }

    public AdministrateurDTO obtenirParId(Long id) {
        return administrateurRepository.findById(id)
                .map(AdministrateurMapper::toDTO)
                .orElse(null);
    }

    public List<AdministrateurDTO> listerAdministrateurs() {
        return administrateurRepository.findAll()
                .stream()
                .map(AdministrateurMapper::toDTO)
                .collect(Collectors.toList());
    }

    public AdministrateurDTO creerAdministrateur(Administrateur administrateur) {
        Administrateur saved = administrateurRepository.save(administrateur);
        return AdministrateurMapper.toDTO(saved);
    }

    public void supprimerAdministrateur(Long id) {
        administrateurRepository.deleteById(id);
    }
}
