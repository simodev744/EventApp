package com.example.eventapp.controllers;


import com.example.eventapp.dtos.AdministrateurDTO;
import com.example.eventapp.models.Administrateur;
import com.example.eventapp.services.AdministrateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdministrateurController {

    private final AdministrateurService adminService;

    public AdministrateurController(AdministrateurService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/{id}")
    public AdministrateurDTO getAdmin(@PathVariable Long id) {
        return adminService.obtenirParId(id);
    }

    @GetMapping
    public List<AdministrateurDTO> getAllAdmins() {
        return adminService.listerAdministrateurs();
    }

    @PostMapping
    public AdministrateurDTO createAdmin(@RequestBody Administrateur admin) {
        return adminService.creerAdministrateur(admin);
    }

    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable Long id) {
        adminService.supprimerAdministrateur(id);
    }
}
