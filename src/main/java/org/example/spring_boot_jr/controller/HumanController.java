package org.example.spring_boot_jr.controller;

import lombok.RequiredArgsConstructor;
import org.example.spring_boot_jr.dto.HumanDto;
import org.example.spring_boot_jr.entity.HumanEntity;
import org.example.spring_boot_jr.service.HumanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/humans")
public class HumanController {

    private final HumanService humanService;

    @GetMapping()
    public List<HumanDto> getAllHumans() {
        return humanService.getAllHumans();
    }

    @GetMapping("/{id}")
    public HumanDto getHumanById(@PathVariable Long id) {
        return humanService.getHumanById(id);
    }

    @PostMapping
    public void addHuman(@RequestBody HumanDto humanDto) {
        humanService.addHuman(humanDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteHumanById(@PathVariable Long id) {
        humanService.deleteHumanById(id);
    }

    @PostMapping("/{id}")
    public void updateHuman(@PathVariable Long id, @RequestBody HumanDto human) {
        humanService.updateHuman(id, human);
    }

}
