package com.tsvirko.lolapi.mapper;

import com.tsvirko.lolapi.domain.SummonerInfoDto;
import com.tsvirko.lolapi.domain.entity.SummonerInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public abstract class SummonerInfoMapper {

    @Mapping(source = "id", target = "id")
    public abstract SummonerInfoDto toDto(SummonerInfo summonerInfo);

    public abstract void updateFromDto(SummonerInfoDto dto, @MappingTarget SummonerInfo summonerInfo);
}
