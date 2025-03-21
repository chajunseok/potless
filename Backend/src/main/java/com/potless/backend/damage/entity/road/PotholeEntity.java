package com.potless.backend.damage.entity.road;

import com.potless.backend.damage.entity.area.AreaEntity;
import com.potless.backend.damage.entity.area.LocationEntity;
import com.potless.backend.damage.entity.enums.Status;
import com.potless.backend.hexagon.entity.HexagonEntity;
import com.potless.backend.member.entity.MemberEntity;
import com.querydsl.core.annotations.QueryProjection;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@DiscriminatorValue("POTHOLE")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PotholeEntity extends DamageEntity {

    @Builder
    @QueryProjection
    public PotholeEntity(Long id, Integer severity, Double dirX, Double dirY, String address, Double width, Status status, AreaEntity areaEntity, LocationEntity locationEntity, HexagonEntity hexagonEntity, List<ImageEntity> imageEntities, String dtype, MemberEntity memberEntity) {
        super(id, severity, dirX, dirY, address, width, status, areaEntity, locationEntity, hexagonEntity, imageEntities, dtype, memberEntity);
    }
}
