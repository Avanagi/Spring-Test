package org.example.spring_boot_jr.mapper;

import org.example.spring_boot_jr.dto.HumanDto;
import org.example.spring_boot_jr.entity.HumanEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HumanMapper {
    HumanDto toHumanDto(HumanEntity humanEntity);

    HumanEntity toHumanEntity(HumanDto humanDto);

    List<HumanDto> toHumanDtoList(List<HumanEntity> humanEntities);

    @Mapping(target = "id", ignore = true)
    void updateHumanFromDto(HumanDto dto, @MappingTarget HumanEntity entity);
}