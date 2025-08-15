package com.crudwebapp.dev.repository;

import com.crudwebapp.dev.model.InventoryOrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryOrdersRepository extends JpaRepository<InventoryOrders, Long> {
	
}
