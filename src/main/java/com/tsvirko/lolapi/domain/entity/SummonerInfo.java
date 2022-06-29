package com.tsvirko.lolapi.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "summoner_info")
public class SummonerInfo {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "account_id")
    private String accountId;
    @Column(name = "profile_icon_id")
    private Integer profileIconId;
    @Column(name = "revision_date")
    private Long revisionDate;
    @Column(name = "name")
    private String name;
    @Column(name = "puuid")
    private String puuid;
    @Column(name = "summoner_level")
    private Long summonerLevel;

}
