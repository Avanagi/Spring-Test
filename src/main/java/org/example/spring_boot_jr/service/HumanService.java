package org.example.spring_boot_jr.service;

import lombok.RequiredArgsConstructor;
import org.example.spring_boot_jr.dto.HumanDto;
import org.example.spring_boot_jr.entity.HumanEntity;
import org.example.spring_boot_jr.mapper.HumanMapper;
import org.example.spring_boot_jr.repository.HumanRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HumanService {

    private final HumanRepository humanRepository;
    private final HumanMapper humanMapper;

    @Transactional(readOnly = true)
    public List<HumanDto> getAllHumans() {
        return humanMapper.toDtoList(humanRepository.findAll());
    }

    @Transactional(readOnly = true)
    public HumanDto getHumanById(Long id) {
        if (id != null) {
            HumanEntity humanEntity = humanRepository.findById(id)
                    .orElseThrow(() -> new NullPointerException("Human with id " + id + " not found"));
            return humanMapper.toDto(humanEntity);
        }
        return null;
    }

    @Transactional
    public void addHuman(HumanDto humanDto) {
        humanRepository.save(humanMapper.toDao(humanDto));
    }

    @Transactional
    public void deleteHumanById(Long id) {
        humanRepository.deleteById(id);
    }

    @Transactional
    public void updateHuman(Long id, HumanDto humanDto) {
        HumanEntity existingHuman = humanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Человек не найден"));
        humanMapper.updateFromDto(humanDto, existingHuman);
        humanRepository.save(existingHuman);
    }
}
