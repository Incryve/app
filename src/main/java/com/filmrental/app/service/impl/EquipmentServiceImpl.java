package com.filmrental.app.service.impl;

import com.filmrental.app.model.Equipment;
import com.filmrental.app.repository.EquipmentRepository;
import com.filmrental.app.service.EquipmentService;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public Equipment update(Long id, Equipment equipment) {
        return equipmentRepository.findById(id)
                .map(existingEquipment -> {
                    existingEquipment.setEquipmentName(equipment.getEquipmentName());
                    existingEquipment.setEquipmentType(equipment.getEquipmentType());
                    existingEquipment.setRentalRate(equipment.getRentalRate());
                    return equipmentRepository.save(existingEquipment);
                }).orElseThrow(() -> new NoSuchElementException("Equipment not found with id: " + id));
    }

    @Override
    public void delete(Long id) {
        equipmentRepository.deleteById(id);
    }

    @Override
    public List<Equipment> findAll() {
        return equipmentRepository.findAll();
    }
}
