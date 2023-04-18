package com.siswoyodotid.origin.controller;

import com.siswoyodotid.origin.entity.OriginEntity;
import com.siswoyodotid.origin.service.OriginService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/origin")
public class OriginController {
    private final OriginService originService;

    public OriginController(OriginService originService) {
        this.originService = originService;
    }

    @GetMapping
    public List<OriginEntity> findAllOrigin() {
        return originService.findAllOrigin();
    }

    @GetMapping("/{id}")
    public Optional<OriginEntity> findOriginById(@PathVariable("id") Long id) {
        return originService.findById(id);
    }

    @PostMapping
    public OriginEntity saveOrigin(@RequestBody OriginEntity originEntity) {
        return originService.saveOrigin(originEntity);
    }

    @PutMapping
    public OriginEntity updateOrigin(@RequestBody OriginEntity originEntity) {
        return originService.updateOrigin(originEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteOrigin(@PathVariable("id") Long id) {
        originService.deleteOrigin(id);
    }

    //    Using Request and Response with save and update origin


}
