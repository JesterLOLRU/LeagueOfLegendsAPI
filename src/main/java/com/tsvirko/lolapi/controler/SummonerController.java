package com.tsvirko.lolapi.controler;

import com.tsvirko.lolapi.domain.ChampionMasteryDto;
import com.tsvirko.lolapi.domain.MasteryPointsDto;
import com.tsvirko.lolapi.domain.SummonerInfoDto;
import com.tsvirko.lolapi.service.SummonerInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/summoner")
@Tag(name = "summoner", description = "Summoner Info Controller")
public class SummonerController {

    @Autowired
    SummonerInfoService summonerInfoService;

    @GetMapping(path = "/searchByName/{summonerName}")
    @Operation(summary = "Return information about player")
    public SummonerInfoDto getSummonerByName(@PathVariable String summonerName) {
        return summonerInfoService.getSummoner(summonerName);
    }

    @GetMapping(path = "/getMastery/{summonerName}")
    @Operation(summary = "Return information about mastery point on every champion of player")
    public MasteryPointsDto getTotalChampionMasteryRanks(@PathVariable String summonerName) {
        return summonerInfoService.getMastery(summonerName);
    }
}
