package com.crudwebapp.dev.service;

import com.crudwebapp.dev.model.InventoryPending;
import com.crudwebapp.dev.repository.InventoryPendingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryPendingServiceImpl implements InventoryPendingService {

    @Autowired
    private InventoryPendingRepository inventoryPendingRepository;

    @Override
    public List<InventoryPending> getAllInventoryPending() {
        return inventoryPendingRepository.findAll();  
    }
}
