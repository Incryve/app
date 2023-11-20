package com.filmrental.app.controller;

import com.filmrental.app.model.Equipment;
import com.filmrental.app.service.EquipmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/equipments")
public class EquipmentController {

    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipment> findById(@PathVariable Long id) {
        var equipment = equipmentService.findById(id);
        return ResponseEntity.ok(equipment);
    }

    @PostMapping
    public ResponseEntity<Equipment> create(@RequestBody Equipment equipmentToCreate) {
        var equipmentCreated = equipmentService.create(equipmentToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(equipmentCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(equipmentCreated);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipment> update(@PathVariable Long id, @RequestBody Equipment equipmentToUpdate) {
        var equipmentUpdated = equipmentService.update(id, equipmentToUpdate);
        return ResponseEntity.ok(equipmentUpdated);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        equipmentService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Equipment>> findAll() {
        var allEquipment = equipmentService.findAll();
        return ResponseEntity.ok(allEquipment);
    }


}
