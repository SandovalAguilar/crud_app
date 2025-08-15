package com.crudwebapp.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudwebapp.dev.model.InventoryOutputs;
import com.crudwebapp.dev.repository.InventoryOutputsRepository;

@Service
public class InventoryOutputsImpl implements InventoryOutputsService{

	@Autowired
	private InventoryOutputsRepository inventoryOutputs;
	
	@Override
	public List<InventoryOutputs> getAllInventoryOutputs() {
		return inventoryOutputs.findAll();
	}

}
