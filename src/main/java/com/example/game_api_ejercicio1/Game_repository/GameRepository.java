package com.example.game_api_ejercicio1.Game_repository;

import com.example.game_api_ejercicio1.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
