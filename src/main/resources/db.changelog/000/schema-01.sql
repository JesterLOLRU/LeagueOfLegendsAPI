create table if not exists summoner_info
(
    id                      varchar(255) not null
        constraint summoner_info_pkey
            primary key,
    account_id              varchar(255),
    profile_icon_id         integer,
    revision_date           bigint,
    name                    varchar(255),
    puuid                   varchar(255),
    summoner_level          integer
);

create table if not exists champions
(
    id                      integer not null
        constraint champions
            primary key,
    name                    varchar(255)

)