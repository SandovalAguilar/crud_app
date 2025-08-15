package com.crudwebapp.dev.repository;

import com.crudwebapp.dev.model.InventoryPending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryPendingRepository extends JpaRepository<InventoryPending, Long> {

}
