package com.example.JSX.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JSX.demo.dto.GameMinDTO;
import com.example.JSX.demo.entities.Game;
import com.example.JSX.demo.repositories.GameRepository;

import java.util.List;

//@Component (Funciona como a service, mas é mais genérico)
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){
        List<Game> searchList =  gameRepository.findAll();
        return searchList;
    }
}
