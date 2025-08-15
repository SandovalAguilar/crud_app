package com.crudwebapp.dev.service;

import com.crudwebapp.dev.model.InventoryOrders;
import com.crudwebapp.dev.repository.InventoryOrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryOrdersImpl implements InventoryOrdersService {

    @Autowired
    private InventoryOrdersRepository inventoryOrdersRepository;

    @Override
    public List<InventoryOrders> getAllInventoryOrders() {
        return inventoryOrdersRepository.findAll();
    }
}
