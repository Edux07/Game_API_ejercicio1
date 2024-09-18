package com.example.game_api_ejercicio1.commons.constants.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ErrorResponse {
    private Integer codeStatus;
    private String message;
}
