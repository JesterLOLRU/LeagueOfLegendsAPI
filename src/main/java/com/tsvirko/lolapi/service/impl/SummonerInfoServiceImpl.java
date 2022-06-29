package com.tsvirko.lolapi.service.impl;

import com.tsvirko.lolapi.domain.entity.SummonerInfo;
import com.tsvirko.lolapi.feign.SummonerApiClient;
import com.tsvirko.lolapi.mapper.SummonerInfoMapper;
import com.tsvirko.lolapi.repository.SummonerInfoRepository;
import com.tsvirko.lolapi.service.SummonerInfoService;
import com.tsvirko.lolapi.domain.SummonerInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SummonerInfoServiceImpl implements SummonerInfoService {

    @Autowired
    SummonerApiClient summonerApi;

    @Autowired
    SummonerInfoRepository summonerInfoRepository;

    @Autowired
    SummonerInfoMapper summonerMapper;

     public SummonerInfoDto getSummoner(String summonerName) {
        var newSummoner = new SummonerInfo();
        var info = summonerApi.getSummonerByName(summonerName);
        summonerMapper.updateFromDto(info, newSummoner);
        summonerInfoRepository.saveAndFlush(newSummoner);
        return summonerMapper.toDto(newSummoner);
     }
}
