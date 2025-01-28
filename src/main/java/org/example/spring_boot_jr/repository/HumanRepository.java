package org.example.spring_boot_jr.repository;

import org.example.spring_boot_jr.entity.HumanEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends PagingAndSortingRepository<HumanEntity, Long> {

    @Query("select human from HumanEntity human")
    List<HumanEntity> getAllHumans();

    @Query("select human from HumanEntity human where human.id=:id")
    HumanEntity getHumanById(Long id);
}
