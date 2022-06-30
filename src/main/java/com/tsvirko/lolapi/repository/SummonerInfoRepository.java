package com.tsvirko.lolapi.repository;

import com.tsvirko.lolapi.domain.entity.SummonerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SummonerInfoRepository extends JpaRepository<SummonerInfo, String> {

    Optional<SummonerInfo> findById(String id);

    Optional<SummonerInfo> findByName(String name);
}
