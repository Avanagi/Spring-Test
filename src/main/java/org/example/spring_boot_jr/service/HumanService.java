package org.example.spring_boot_jr.service;

import lombok.RequiredArgsConstructor;
import org.example.spring_boot_jr.entity.HumanEntity;
import org.example.spring_boot_jr.repository.HumanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HumanService {

    private final HumanRepository humanRepository;

    public List<HumanEntity> getAllHumans() {
        return humanRepository.getAllHumans();
    }

    public HumanEntity getHumanById(Long id) {
        if (id != null) {
            return humanRepository.getHumanById(id);
        }
        return null;
    }

}
