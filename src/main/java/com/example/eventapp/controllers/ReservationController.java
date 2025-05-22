package com.example.eventapp.controllers;

import com.example.eventapp.dtos.ReservationDTO;
import com.example.eventapp.services.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public ReservationDTO reserver(@RequestBody ReservationDTO dto) {
        return reservationService.reserver(dto);
    }

    @GetMapping("/client/{clientId}")
    public List<ReservationDTO> getReservationsParClient(@PathVariable Long clientId) {
        return reservationService.obtenirReservationsParClient(clientId);
    }

    @DeleteMapping("/{id}")
    public void annuler(@PathVariable Long id) {
        reservationService.annulerReservation(id);
    }
}
