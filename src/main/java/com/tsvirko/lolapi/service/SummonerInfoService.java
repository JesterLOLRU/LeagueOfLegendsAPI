package com.tsvirko.lolapi.service;

import com.tsvirko.lolapi.domain.ChampionMasteryDto;
import com.tsvirko.lolapi.domain.SummonerInfoDto;

import java.util.List;

/**
 * The service which works with the data of the Summoner
 */
public interface SummonerInfoService {

    SummonerInfoDto getSummoner(String summonerName);
    Integer getTotalChampionMastery(String summonerName);
    String getIdByName(String summonerName);
    List<ChampionMasteryDto> getAllChampionsMastery(String summonerName);

}
