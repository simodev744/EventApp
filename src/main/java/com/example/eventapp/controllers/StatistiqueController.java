package com.example.eventapp.controllers;

import com.example.eventapp.services.StatistiqueService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/stats")
public class StatistiqueController {

    private final StatistiqueService statistiqueService;

    public StatistiqueController(StatistiqueService statistiqueService) {
        this.statistiqueService = statistiqueService;
    }

    @GetMapping("/reservations")
    public Map<String, Long> getStatsReservations() {
        return statistiqueService.obtenirStatsReservations();
    }

    @GetMapping("/evenements")
    public Map<String, Long> getStatsEvenements() {
        return statistiqueService.obtenirStatsEvenements();
    }
}
