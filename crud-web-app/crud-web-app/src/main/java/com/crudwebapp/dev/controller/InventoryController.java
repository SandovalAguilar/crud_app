package com.crudwebapp.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.crudwebapp.dev.service.InventoryEntriesService;
import com.crudwebapp.dev.service.InventoryOutputsService;

@Controller
public class InventoryController {

    @Autowired
    private InventoryEntriesService inventoryEntriesService;

    @Autowired
    private InventoryOutputsService inventoryOutputsService;

    @GetMapping("/")
    public String viewInventory(Model model) {
        // Fetch the lists from both services
        model.addAttribute("listInventoryEntries", inventoryEntriesService.getAllInventoryEntries());
        model.addAttribute("listInventoryOutputs", inventoryOutputsService.getAllInventoryOutputs());
        return "index";  // Return the combined HTML page with both lists
    }
}
