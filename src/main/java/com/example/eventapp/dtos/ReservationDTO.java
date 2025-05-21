package com.example.eventapp.dtos;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReservationDTO {
    private Long id;
    private LocalDateTime dateReservation;
    private Long clientId;
    private Long evenementId;
}
