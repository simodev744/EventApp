package com.example.eventapp.services;

import com.example.eventapp.repository.ReservationRepository;
import com.example.eventapp.repository.EvenementRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StatistiqueService {

    private final ReservationRepository reservationRepository;
    private final EvenementRepository evenementRepository;

    public StatistiqueService(ReservationRepository reservationRepository,
                              EvenementRepository evenementRepository) {
        this.reservationRepository = reservationRepository;
        this.evenementRepository = evenementRepository;
    }

    public Map<String, Long> obtenirStatsReservations() {
        Map<String, Long> stats = new HashMap<>();
        stats.put("totalReservations", reservationRepository.count());
        return stats;
    }

    public Map<String, Long> obtenirStatsEvenements() {
        Map<String, Long> stats = new HashMap<>();
        stats.put("totalEvenements", evenementRepository.count());
        return stats;
    }
}
