package com.example.game_api_ejercicio1.Game_controller.impl;

import com.example.game_api_ejercicio1.commons.constants.Exceptions.GameException;
import com.example.game_api_ejercicio1.commons.constants.dto.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j //Permite hacer logs
public class ExceptionHanderController {
    @ExceptionHandler(value = GameException.class)
    ResponseEntity<ErrorResponse> handleErrorResponse(GameException ex) {
        log.error("Error: ", ex);
        var errorResponse = ErrorResponse.builder()
                .codeStatus(ex.getHttpStatus().value())
                .message(ex.getMessage())
                .build();
        return ResponseEntity.status(ex.getHttpStatus()).body(errorResponse);
    }
}
