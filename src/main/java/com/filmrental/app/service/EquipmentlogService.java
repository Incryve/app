package com.filmrental.app.service;

import com.filmrental.app.model.Equipmentlog;

import java.util.List;

public interface EquipmentlogService {
    Equipmentlog findById(Long id);
    Equipmentlog create(Equipmentlog equipmentLogToCreate);
    Equipmentlog update(Long id, Equipmentlog equipmentLog);
    void delete(Long id);
    List<Equipmentlog> findAll();
}
