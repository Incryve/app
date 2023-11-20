package com.filmrental.app.service.impl;

import com.filmrental.app.model.Equipmentlog;
import com.filmrental.app.repository.EquipmentlogRepository;
import com.filmrental.app.service.EquipmentlogService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class EquipmentlogServiceImpl implements EquipmentlogService {

    private final EquipmentlogRepository equipmentlogRepository;

    public EquipmentlogServiceImpl(EquipmentlogRepository equipmentlogRepository) {
        this.equipmentlogRepository = equipmentlogRepository;
    }

    @Override
    public Equipmentlog findById(Long id) {
        return equipmentlogRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Equipmentlog create(Equipmentlog equipmentLogToCreate) {
        if (equipmentlogRepository.existsById(equipmentLogToCreate.getId())){
            throw new IllegalArgumentException("The equipment log id already exists.");
        }
        return equipmentlogRepository.save(equipmentLogToCreate);
    }
}
