package org.example.spring_boot_jr.controller;

import lombok.RequiredArgsConstructor;
import org.example.spring_boot_jr.entity.HumanEntity;
import org.example.spring_boot_jr.service.HumanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/humans")
public class HumanController {

    private final HumanService humanService;

    @GetMapping()
    public List<HumanEntity> getAllHumans() {
        return humanService.getAllHumans();
    }

    @GetMapping("/{id}")
    public HumanEntity getHumanById(@PathVariable Long id) {
        return humanService.getHumanById(id);
    }

}
