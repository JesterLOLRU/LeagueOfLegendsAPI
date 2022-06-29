create table if not exists summoner_info
(
    id                   varchar(255) not null
        constraint history_property_record_pkey
            primary key,
    account_id            varchar(255),
    profile_icon_id        integer,
    revision_date         real,
    name                 varchar(255),
    puuid                varchar(255),
    summoner_level        real
);