package com.tsvirko.lolapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameInfoDto {
    private Long gameId;
    private String gameType;
    private Long gameStartTime;
    private Long mapId;
    private Long gameLength;
    private String gameMode;
    private List<BannedChampionsDto> bannedChampions;
    private Long gameQueueConfigId;
    private List<GameParticipants> participants;
}
