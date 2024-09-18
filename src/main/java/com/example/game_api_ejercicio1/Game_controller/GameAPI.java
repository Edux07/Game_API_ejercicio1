package com.example.game_api_ejercicio1.Game_controller;

import com.example.game_api_ejercicio1.commons.constants.APIpathVariable;
import com.example.game_api_ejercicio1.commons.constants.entities.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(APIpathVariable.v1_route + APIpathVariable.games_route)
public interface GameAPI {
    @PostMapping
    ResponseEntity<Game> Savegame(@RequestBody Game game);
    @GetMapping
    ResponseEntity<Game> GetgameByiD(@PathVariable String id);
}
