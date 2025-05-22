package com.example.eventapp.controllers;

import com.example.eventapp.dtos.UtilisateurDTO;
import com.example.eventapp.models.Utilisateur;
import com.example.eventapp.services.UtilisateurService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @PostMapping("/inscription")
    public UtilisateurDTO inscrire(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.inscrire(utilisateur);
    }

    @GetMapping("/email")
    public UtilisateurDTO getByEmail(@RequestParam String email) {
        return utilisateurService.trouverParEmail(email);
    }

    @PutMapping("/{id}")
    public UtilisateurDTO mettreAJour(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
        return utilisateurService.mettreAJourProfil(id, utilisateur);
    }
}
