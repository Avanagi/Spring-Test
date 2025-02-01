package org.example.spring_boot_jr.repository;

import org.example.spring_boot_jr.entity.HumanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<HumanEntity, Long> {

}
