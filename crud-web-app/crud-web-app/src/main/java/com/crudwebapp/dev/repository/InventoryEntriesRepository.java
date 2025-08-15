package com.crudwebapp.dev.repository;

import com.crudwebapp.dev.model.InventoryEntries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryEntriesRepository extends JpaRepository<InventoryEntries, Long> {

}
