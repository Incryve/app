package com.filmrental.app.service.impl;

import com.filmrental.app.model.Equipment;
import com.filmrental.app.repository.EquipmentRepository;
import com.filmrental.app.service.EquipmentService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public EquipmentServiceImpl(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @Override
    public Equipment findById(Long id) {
        return equipmentRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Equipment create(Equipment equipmentToCreate) {
        if (equipmentRepository.existsById(equipmentToCreate.getId())) {
            throw new IllegalArgumentException("This equipment already exists.");
        }
        return equipmentRepository.save(equipmentToCreate);
    }
}
