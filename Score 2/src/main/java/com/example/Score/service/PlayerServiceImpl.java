package com.example.Score.service;

import com.example.Score.entity.Player;
import com.example.Score.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PlayerServiceImpl implements  PlayerService{

    @Autowired
    private PlayerRepo playerRepo;




//    @Autowired
//    public PlayerServiceImpl(WebClient.Builder webClientBuilder) {
//        this.webClient = webClientBuilder.baseUrl("http://api.football-data.org/v4").build();
//    }

    @Override
    List<Player> getAllPlayers() {
        return playerRepo.findAll();
    }

    @Override
    public Player getPlayersById(Long id){
        return playerRepo.findById(id).orElseThrow();
    }

    @Override
    public Player savePlayer(Player player){
        return playerRepo.save(player);
    }

    @Override
    public void deletePlayer(Long id){
        playerRepo.deleteById(id);
    }

//    public Player fetchPlayerFromAPI(Long id){
//
//        return this.webClient.get()
//                .uri("/persons/{id}", id)
//                .header("X-Auth-Token", "5576d3daf0c143b79ccbb7c9a1b22607")
//                .retrieve()
//                .bodyToMono(Player.class)
//                .block();
//    }
}
