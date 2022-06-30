package com.tsvirko.lolapi.feign;


import com.tsvirko.lolapi.config.FeignConfiguration;
import com.tsvirko.lolapi.domain.GameInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "spectator-api-client",
        url = "${feign.spectator-api.url}",
        path = "${feign.spectator-api.path}",
        configuration = FeignConfiguration.class
)
public interface SpectatorApiClient {

    @GetMapping("/active-games/by-summoner/{encryptedSummonerId}")
    GameInfoDto getCurrentGame(@PathVariable String encryptedSummonerId);
}
