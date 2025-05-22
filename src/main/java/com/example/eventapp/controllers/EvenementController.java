package com.example.eventapp.controllers;


import com.example.eventapp.dtos.EvenementDTO;
import com.example.eventapp.models.Evenement;
import com.example.eventapp.services.EvenementService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/evenements")
public class EvenementController {

    private final EvenementService evenementService;

    public EvenementController(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

    @PostMapping
    public EvenementDTO creer(@RequestBody Evenement evenement) {
        return evenementService.creer(evenement);
    }

    @PutMapping("/{id}")
    public EvenementDTO modifier(@PathVariable Long id, @RequestBody Evenement evenement) {
        return evenementService.modifier(id, evenement);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        evenementService.supprimer(id);
    }

    @GetMapping("/{id}")
    public EvenementDTO obtenirParId(@PathVariable Long id) {
        return evenementService.obtenirParId(id);
    }

    @GetMapping("/date")
    public List<EvenementDTO> rechercherParDate(@RequestParam String date) {
        return evenementService.rechercherParDate(LocalDate.parse(date));
    }
}
