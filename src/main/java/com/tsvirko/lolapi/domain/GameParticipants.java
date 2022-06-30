package com.tsvirko.lolapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameParticipants {
    private Long championId;
    private Perks perk;
    private Long profileIconId;
    private Boolean bot;
    private Long teamId;
    private String summonerName;
    private String summonerId;
    private Long spell1Id;
    private Long spell2Id;
}
