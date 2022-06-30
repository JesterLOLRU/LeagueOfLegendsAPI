package com.tsvirko.lolapi.feign;

import com.tsvirko.lolapi.config.FeignConfiguration;
import com.tsvirko.lolapi.domain.ChampionMasteryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name = "champion-mastery-api-client",
        url = "${feign.champion-mastery-api.url}",
        path = "${feign.champion-mastery-api.path}",
        configuration = FeignConfiguration.class
)
public interface ChampionMasteryApiClient {

    @GetMapping(path = "/scores/by-summoner/{encryptedSummonerId}")
    Integer getPlayersTotalChampionMastery(@PathVariable String encryptedSummonerId);

    @GetMapping(path = "/champion-masteries/by-summoner/{encryptedSummonerId}")
    List<ChampionMasteryDto> getAllChampionMastery(@PathVariable String encryptedSummonerId);

}
