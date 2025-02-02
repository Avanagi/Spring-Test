package org.example.spring_boot_jr.mapper;

import org.example.spring_boot_jr.dto.HumanDto;
import org.example.spring_boot_jr.entity.HumanEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HumanMapper extends MapperHelper<HumanDto, HumanEntity> {

    List<HumanDto> toDtoList(List<HumanEntity> humanEntities);

    @Mapping(target = "id", ignore = true)
    void updateFromDto(HumanDto dto, @MappingTarget HumanEntity entity);
}