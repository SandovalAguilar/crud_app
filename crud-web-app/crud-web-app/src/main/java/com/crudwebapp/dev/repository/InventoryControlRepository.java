package com.crudwebapp.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crudwebapp.dev.model.InventoryControl;

public interface InventoryControlRepository extends JpaRepository<InventoryControl, Long> {

}
