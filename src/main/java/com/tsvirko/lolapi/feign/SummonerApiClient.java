package com.tsvirko.lolapi.feign;

import com.tsvirko.lolapi.config.FeignConfiguration;
import com.tsvirko.lolapi.domain.SummonerInfoDto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(
        name = "summoner-api-client",
        url = "${feign.summoner-api.url}",
        path = "${feign.summoner-api.path}",
        configuration = {FeignConfiguration.class}

)

public interface SummonerApiClient {
    @GetMapping(path = "/by-name/{summonerName}")
    SummonerInfoDto getSummonerByName(@PathVariable String summonerName);

    @GetMapping(path = "/by-puuid/{PUUID}")
    SummonerInfoDto getSummonerByPUUID(@PathVariable String PUUID);
}
