package com.example.eventapp.controllers;


import com.example.eventapp.dtos.ClientDTO;
import com.example.eventapp.models.Client;
import com.example.eventapp.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public ClientDTO getClient(@PathVariable Long id) {
        return clientService.obtenirParId(id);
    }

    @GetMapping
    public List<ClientDTO> getAllClients() {
        return clientService.listerClients();
    }

    @PostMapping
    public ClientDTO createClient(@RequestBody Client client) {
        return clientService.creerClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.supprimerClient(id);
    }
}
