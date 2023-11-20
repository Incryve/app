package com.filmrental.app.service;

import com.filmrental.app.model.Equipmentlog;

public interface EquipmentlogService {
    Equipmentlog findById(Long id);
    Equipmentlog create(Equipmentlog equipmentLogToCreate);
}
