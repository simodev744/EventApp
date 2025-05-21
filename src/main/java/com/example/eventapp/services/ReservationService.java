package com.example.eventapp.services;


import com.example.eventapp.dtos.ReservationDTO;
import com.example.eventapp.mapper.ReservationMapper;
import com.example.eventapp.models.Client;
import com.example.eventapp.models.Evenement;
import com.example.eventapp.models.Reservation;
import com.example.eventapp.repository.ClientRepository;
import com.example.eventapp.repository.EvenementRepository;
import com.example.eventapp.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;
    private final EvenementRepository evenementRepository;

    public ReservationService(ReservationRepository reservationRepository,
                              ClientRepository clientRepository,
                              EvenementRepository evenementRepository) {
        this.reservationRepository = reservationRepository;
        this.clientRepository = clientRepository;
        this.evenementRepository = evenementRepository;
    }

    public ReservationDTO reserver(ReservationDTO reservationDTO) {
        Client client = clientRepository.findById(reservationDTO.getClientId()).orElse(null);
        Evenement evenement = evenementRepository.findById(reservationDTO.getEvenementId()).orElse(null);
        if (client == null || evenement == null) {
            throw new IllegalArgumentException("Client or Evenement not found");
        }
        Reservation reservation = ReservationMapper.toEntity(reservationDTO, client, evenement);
        reservation.setDateReservation(java.time.LocalDateTime.now());
        Reservation saved = reservationRepository.save(reservation);
        return ReservationMapper.toDTO(saved);
    }

    public List<ReservationDTO> obtenirReservationsParClient(Long clientId) {
        return reservationRepository.findByClientId(clientId)
                .stream()
                .map(ReservationMapper::toDTO)
                .collect(Collectors.toList());
    }

    public void annulerReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
