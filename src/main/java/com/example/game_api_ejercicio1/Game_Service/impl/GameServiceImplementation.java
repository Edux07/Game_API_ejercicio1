package com.example.game_api_ejercicio1.Game_Service.impl;

import com.example.game_api_ejercicio1.Game_Service.GameService;
import com.example.game_api_ejercicio1.commons.constants.Exceptions.GameException;
import com.example.game_api_ejercicio1.commons.constants.entities.Game;
import com.example.game_api_ejercicio1.Game_repository.GameRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImplementation implements GameService {
    private final GameRepository gameRepository;

    public GameServiceImplementation(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Game saveGame(Game gameRequest){
        Game gameCreatedindatabase = this.gameRepository.save(gameRequest);
        return gameCreatedindatabase;
    }

    @Override
    public Game getGameById(String id) {
        return this.gameRepository.findById(Long.valueOf(id)).orElseThrow(() -> new GameException(HttpStatus.NOT_FOUND, "Game not found"));
    }

    @Override
    public Game updateGame(Game gameRequest) {
        return this.gameRepository.save(gameRequest);
    }

    @Override
    public Game deleteGame(String id) {
        return this.gameRepository.findById(Long.valueOf(id)).map(game -> {
            this.gameRepository.delete(game);
            return game;
        }).orElseThrow(() -> new GameException(HttpStatus.NOT_FOUND, "Game not found"));
    }


}
