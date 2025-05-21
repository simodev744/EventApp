package com.example.eventapp.mapper;


import com.example.eventapp.dtos.ReservationDTO;
import com.example.eventapp.models.Client;
import com.example.eventapp.models.Evenement;
import com.example.eventapp.models.Reservation;

public class ReservationMapper {

    public static ReservationDTO toDTO(Reservation reservation) {
        if (reservation == null) return null;
        ReservationDTO dto = new ReservationDTO();
        dto.setId(reservation.getId());
        dto.setDateReservation(reservation.getDateReservation());
        dto.setClientId(reservation.getClient() != null ? reservation.getClient().getId() : null);
        dto.setEvenementId(reservation.getEvenement() != null ? reservation.getEvenement().getId() : null);
        return dto;
    }

    public static Reservation toEntity(ReservationDTO dto, Client client, Evenement evenement) {
        if (dto == null) return null;
        Reservation reservation = new Reservation();
        reservation.setId(dto.getId());
        reservation.setDateReservation(dto.getDateReservation());
        reservation.setClient(client);
        reservation.setEvenement(evenement);
        return reservation;
    }
}
