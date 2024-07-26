package com.example.Score.service;

import com.example.Score.entity.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers(); // gets all the players in the api

    Player getPlayersById(Long id); // a method responsible for getting a specific player based on id

    Player savePlayer(Player player); //a method responsible for saving a player to the list

    void deletePlayer(Long id); // a method responsible for deleting a play from the list


}
