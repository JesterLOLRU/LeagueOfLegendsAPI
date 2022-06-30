package com.tsvirko.lolapi.service;


import com.tsvirko.lolapi.domain.GameInfoDto;

/**
 * Service that works with current game
 */
public interface CurrentGameService {

    GameInfoDto getCurrentGame(String summonerName);
}
