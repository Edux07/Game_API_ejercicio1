package com.example.game_api_ejercicio1.Game_Service;

import com.example.game_api_ejercicio1.commons.constants.entities.Game;

public interface GameService {
    Game saveGame(Game gameRequest);

    Game getGameById(String id);
}
