package com.filmrental.app.controller;

import com.filmrental.app.model.Equipmentlog;
import com.filmrental.app.service.EquipmentlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/equipment-logs")
public class EquipmentlogController {

    private final EquipmentlogService equipmentlogService;

    public EquipmentlogController(EquipmentlogService equipmentlogService) {
        this.equipmentlogService = equipmentlogService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipmentlog> findBy(@PathVariable Long id) {
        var equipmentLog = equipmentlogService.findById(id);
        return ResponseEntity.ok(equipmentLog);
    }

    @PostMapping
    public ResponseEntity<Equipmentlog> create(@RequestBody Equipmentlog equipmentLogToCreate) {
        var equipmentlogCreated = equipmentlogService.create(equipmentLogToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(equipmentlogCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(equipmentLogToCreate);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipmentlog> update(@PathVariable Long id, @RequestBody Equipmentlog equipmentLogToUpdate) {
        var equipmentlogUpdated = equipmentlogService.update(id, equipmentLogToUpdate);
        return ResponseEntity.ok(equipmentlogUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        equipmentlogService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Equipmentlog>> findAll() {
        var allEquipmentlogs = equipmentlogService.findAll();
        return ResponseEntity.ok(allEquipmentlogs);
    }

}
