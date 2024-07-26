package com.example.Score.controller;


import com.example.Score.entity.Player;
import com.example.Score.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v4/persons")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable Long id){
        return playerService.getPlayersById(id);
    }

    @PostMapping
    public Player savePlayer(@RequestBody Player player){
        return playerService.savePlayer(player);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id){
        playerService.deletePlayer(id);
    }

    @GetMapping("/fetch/{id}")
    public Player fetchPlayerFromAPI (@PathVariable Long id){
        return playerService.fetchPlayerFromAPI(id);
    }
}
