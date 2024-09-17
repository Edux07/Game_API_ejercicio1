package com.example.game_api_ejercicio1.Game_Service;

import com.example.game_api_ejercicio1.Entities.Game;
import com.example.game_api_ejercicio1.Game_repository.GameRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game saveGame(Game gameRequest){
        Game gameCreatedindatabase = this.gameRepository.save(gameRequest);
        return gameCreatedindatabase;
    }
}
