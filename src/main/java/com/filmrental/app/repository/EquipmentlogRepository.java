package com.filmrental.app.repository;

import com.filmrental.app.model.Equipmentlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentlogRepository extends JpaRepository<Equipmentlog, Long> {
}
