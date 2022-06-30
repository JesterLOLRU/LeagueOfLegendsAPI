package com.tsvirko.lolapi.service.impl;

import com.tsvirko.lolapi.domain.GameInfoDto;
import com.tsvirko.lolapi.feign.SpectatorApiClient;
import com.tsvirko.lolapi.service.CurrentGameService;
import com.tsvirko.lolapi.service.SummonerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CurrentGameServiceImpl implements CurrentGameService {

    @Autowired
    private SpectatorApiClient spectatorApi;

    @Autowired
    private SummonerInfoService summonerInfoService;

    @Override
    public GameInfoDto getCurrentGame(String summonerName) {
        String id = summonerInfoService.getIdByName(summonerName);
        return spectatorApi.getCurrentGame(id);
    }
}
