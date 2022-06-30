package com.tsvirko.lolapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChampionMasteryDto {
    private Integer championId;
    private Integer championLevel;
    private Integer championPoints;
    private Boolean chestGranted;
}
