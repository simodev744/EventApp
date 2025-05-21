package com.example.eventapp.services;
import com.example.eventapp.dtos.EvenementDTO;
import com.example.eventapp.mapper.EvenementMapper;
import com.example.eventapp.models.Evenement;
import com.example.eventapp.repository.EvenementRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EvenementService {

    private final EvenementRepository evenementRepository;

    public EvenementService(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

    public EvenementDTO creer(Evenement evenement) {
        Evenement saved = evenementRepository.save(evenement);
        return EvenementMapper.toDTO(saved);
    }

    public EvenementDTO modifier(Long id, Evenement evenementMisAJour) {
        return evenementRepository.findById(id).map(evenement -> {
            evenement.setTitre(evenementMisAJour.getTitre());
            evenement.setDate(evenementMisAJour.getDate());
            evenement.setLieu(evenementMisAJour.getLieu());
            evenement.setCategorie(evenementMisAJour.getCategorie());
            evenement.setDescription(evenementMisAJour.getDescription());
            Evenement updated = evenementRepository.save(evenement);
            return EvenementMapper.toDTO(updated);
        }).orElse(null);
    }

    public void supprimer(Long id) {
        evenementRepository.deleteById(id);
    }

    public EvenementDTO obtenirParId(Long id) {
        return evenementRepository.findById(id)
                .map(EvenementMapper::toDTO)
                .orElse(null);
    }

    public List<EvenementDTO> rechercherParDate(LocalDate date) {
        return evenementRepository.findByDate(date)
                .stream()
                .map(EvenementMapper::toDTO)
                .collect(Collectors.toList());
    }
}
