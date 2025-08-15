package com.crudwebapp.dev.service;

import com.crudwebapp.dev.model.InventoryControl;
import com.crudwebapp.dev.repository.InventoryControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryControlServiceImpl implements InventoryControlService {

    @Autowired
    private InventoryControlRepository inventoryControlRepository;

    @Override
    public List<InventoryControl> getAllInventoryControls() {
        return inventoryControlRepository.findAll();
    }
}
