package com.tsvirko.lolapi.service.impl;

import com.tsvirko.lolapi.domain.ChampionMasteryDto;
import com.tsvirko.lolapi.domain.entity.SummonerInfo;
import com.tsvirko.lolapi.feign.ChampionMasteryApiClient;
import com.tsvirko.lolapi.feign.SummonerApiClient;
import com.tsvirko.lolapi.mapper.SummonerInfoMapper;
import com.tsvirko.lolapi.repository.SummonerInfoRepository;
import com.tsvirko.lolapi.service.SummonerInfoService;
import com.tsvirko.lolapi.domain.SummonerInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SummonerInfoServiceImpl implements SummonerInfoService {

    @Autowired
    SummonerApiClient summonerApi;

    @Autowired
    SummonerInfoRepository summonerInfoRepository;

    @Autowired
    SummonerInfoMapper summonerMapper;

    @Autowired
    ChampionMasteryApiClient championMasteryApi;

     public SummonerInfoDto getSummoner(String summonerName) {
        var information = new SummonerInfoDto();
        var summoner = summonerInfoRepository.findByName(summonerName);
        if (summoner.isEmpty()) {
            var newSummoner = new SummonerInfo();
            information = summonerApi.getSummonerByName(summonerName);
            summonerMapper.updateFromDto(information, newSummoner);
            summonerInfoRepository.saveAndFlush(newSummoner);
        } else {
            information = summonerApi.getSummonerByPUUID(summoner.get().getPuuid());
            summonerMapper.updateFromDto(information, summoner.get());
            summonerInfoRepository.save(summoner.get());
        }
        return information;
     }

     public Integer getTotalChampionMastery(String summonerName) {
         String id = getIdByName(summonerName);
         return championMasteryApi.getPlayersTotalChampionMastery(id);
     }

     public String getIdByName(String summonerName) {
         var summoner = new SummonerInfoDto();
         var summonerFromDb = summonerInfoRepository.findByName(summonerName);
         if (summonerFromDb.isEmpty()) {
             summoner = getSummoner(summonerName);
         } else {
             summoner = summonerMapper.toDto(summonerFromDb.get());
         }
         return summoner.getId();
     }

     public List<ChampionMasteryDto> getAllChampionsMastery(String summonerName) {
         String id = getIdByName(summonerName);
         return championMasteryApi.getAllChampionMastery(id);
     }
}
