package com.crudwebapp.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudwebapp.dev.model.InventoryOutputs;

@Repository
public interface InventoryOutputsRepository extends JpaRepository<InventoryOutputs, Long>{

}
