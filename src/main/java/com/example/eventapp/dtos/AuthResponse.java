package com.example.eventapp.dtos;


public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public AuthResponse() {
    }

    public void setToken(String token) {
        this.token = token;
    }
}
