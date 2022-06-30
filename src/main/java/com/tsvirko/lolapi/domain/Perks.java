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
public class Perks {
    private List<Long> perkIds;
    private Long perkStyle;
    private Long perkSubStyle;
}
