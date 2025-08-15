package com.crudwebapp.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.crudwebapp.dev.service.InventoryOutputsService;

@Controller
public class InventoryOutputsController {
	
	@Autowired
	private InventoryOutputsService inventoryOutputsService;
	
	// Display list of items
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listInventoryOutputs", inventoryOutputsService.getAllInventoryOutputs());
		return "index";
	}
}
