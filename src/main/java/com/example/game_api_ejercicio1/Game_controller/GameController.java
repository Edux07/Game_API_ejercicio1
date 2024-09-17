package com.example.game_api_ejercicio1.Game_controller;

import com.example.game_api_ejercicio1.Entities.Game;
import com.example.game_api_ejercicio1.Game_Service.GameService;
import com.example.game_api_ejercicio1.Game_repository.GameRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameController {
    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public ResponseEntity<Game> Savegame(@RequestBody Game game){
    Game gameCreated = this.gameService.saveGame(game);
    return ResponseEntity.ok(gameCreated);
    }


}
