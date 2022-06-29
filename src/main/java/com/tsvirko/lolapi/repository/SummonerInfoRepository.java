package com.tsvirko.lolapi.repository;

import com.tsvirko.lolapi.domain.entity.SummonerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SummonerInfoRepository extends JpaRepository<SummonerInfo, String> {
    SummonerInfo findByName(String name);
}
