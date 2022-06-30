package com.tsvirko.lolapi.service;

import com.tsvirko.lolapi.domain.ChampionMasteryDto;
import com.tsvirko.lolapi.domain.MasteryPointsDto;
import com.tsvirko.lolapi.domain.SummonerInfoDto;

import java.util.List;

/**
 * The service which works with the data of the Summoner
 */
public interface SummonerInfoService {

    /**
     * A method that returns information about the summoner
     * @param summonerName Name of the summoner
     * @return {@Link} SummonerInfoDto
     */
    SummonerInfoDto getSummoner(String summonerName);

    /**
     * A method that returns information about the mastery ranks, points, and champs of the summoner
     * @param summonerName Name of the summoner
     * @return {@Link} MasteryPointsDto
     */
    MasteryPointsDto getMastery(String summonerName);

    /**
     * The method that returns Id of the summoner
     * @param summonerName Name of the summoner
     * @return String Id
     */
    String getIdByName(String summonerName);

    /**
     * A method that returns the total of all mother points on the summoner's account
     * @param champions List of champions with mastery points
     * @return Integer total mastery points
     */
    Integer getTotalMasteryPoints(List<ChampionMasteryDto> champions);

}
