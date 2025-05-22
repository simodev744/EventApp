package com.example.eventapp.dtos;

import lombok.*;
import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReservationDTO {
    private Long id;
    private LocalDateTime dateReservation;
    private Long clientId;
    private Long evenementId;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getEvenementId() {
        return evenementId;
    }

    public void setEvenementId(Long evenementId) {
        this.evenementId = evenementId;
    }
}
