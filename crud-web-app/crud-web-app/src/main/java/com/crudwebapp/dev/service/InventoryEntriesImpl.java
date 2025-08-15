package com.crudwebapp.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudwebapp.dev.model.InventoryEntries;
import com.crudwebapp.dev.repository.InventoryEntriesRepository;

@Service
public class InventoryEntriesImpl implements InventoryEntriesService {

    @Autowired
    private InventoryEntriesRepository inventoryEntriesRepository;

    @Override
    public List<InventoryEntries> getAllInventoryEntries() {
        return inventoryEntriesRepository.findAll();
    }
}
