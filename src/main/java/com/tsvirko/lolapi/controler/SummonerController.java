package com.tsvirko.lolapi.controler;

import com.tsvirko.lolapi.domain.SummonerInfoDto;
import com.tsvirko.lolapi.service.SummonerInfoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/summoner")
@Tag(name = "summoner", description = "Summoner Info Controller")
public class SummonerController {

    @Autowired
    SummonerInfoService summonerInfoService;

    @GetMapping(path = "/searchByName/{summonerName}")
    public SummonerInfoDto getSummonerByName(@PathVariable String summonerName) {
        return summonerInfoService.getSummoner(summonerName);
    }
}