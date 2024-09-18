package com.example.game_api_ejercicio1.commons.constants.Exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class GameException extends RuntimeException{
    private HttpStatus httpStatus;
    public GameException(HttpStatus notFound, String message) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
