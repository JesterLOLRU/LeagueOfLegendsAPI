package com.tsvirko.lolapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BannedChampionsDto {
    private Integer pickTurn;
    private Long championId;
    private Long teamId;
}
