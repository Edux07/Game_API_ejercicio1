package com.example.game_api_ejercicio1.Game_controller.impl;

import com.example.game_api_ejercicio1.Game_Service.GameService;
import com.example.game_api_ejercicio1.Game_controller.GameAPI;
import com.example.game_api_ejercicio1.commons.constants.entities.Game;
import com.example.game_api_ejercicio1.Game_Service.impl.GameServiceImplementation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController implements GameAPI {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public ResponseEntity<Game> Savegame(@RequestBody Game game){
    Game gameCreated = this.gameService.saveGame(game);
    return ResponseEntity.ok(gameCreated);
    }

    @Override
    public ResponseEntity<Game> GetgameByiD(String id) {
        return ResponseEntity.ok(this.gameService.getGameById(id));
    }


}
