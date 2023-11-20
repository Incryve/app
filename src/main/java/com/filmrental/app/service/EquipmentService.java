package com.filmrental.app.service;

import com.filmrental.app.model.Equipment;

public interface EquipmentService {

    Equipment findById(Long id);
    Equipment create(Equipment equipmentToCreate);

}
