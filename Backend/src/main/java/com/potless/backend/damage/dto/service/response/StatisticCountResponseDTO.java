package com.potless.backend.damage.dto.service.response;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StatisticCountResponseDTO {

    private String areaGu;
    private Long countDamageBefore;
    private Long countDamageDone;

    @Builder
    public StatisticCountResponseDTO(String areaGu, Long countDamageBefore, Long countDamageDone) {
        this.areaGu = areaGu;
        this.countDamageBefore = countDamageBefore;
        this.countDamageDone = countDamageDone;
    }
}
