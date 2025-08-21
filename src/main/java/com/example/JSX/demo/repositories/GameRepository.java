package com.example.JSX.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JSX.demo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{


}
