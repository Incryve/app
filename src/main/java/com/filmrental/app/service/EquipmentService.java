package com.filmrental.app.service;

import com.filmrental.app.model.Equipment;

import java.util.List;

public interface EquipmentService {

    Equipment findById(Long id);
    Equipment create(Equipment equipmentToCreate);
    Equipment update(Long id, Equipment equipment);
    void delete(Long id);
    List<Equipment> findAll();

}
