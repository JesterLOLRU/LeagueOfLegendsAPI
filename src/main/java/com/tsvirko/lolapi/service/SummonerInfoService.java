package com.tsvirko.lolapi.service;

import com.tsvirko.lolapi.domain.SummonerInfoDto;

/**
 * The service which works with the data of the Summoner
 */
public interface SummonerInfoService {

    SummonerInfoDto getSummoner(String summonerName);

}
