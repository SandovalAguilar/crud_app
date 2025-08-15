package com.crudwebapp.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.crudwebapp.dev.service.InventoryEntriesService;

@Controller
public class InventoryEntriesController {
    
    @Autowired
    private InventoryEntriesService inventoryEntriesService;
    
    // Display list of items for inventory entries
    @GetMapping("/inventory-entries")
    public String viewInventoryEntries(Model model) {
        model.addAttribute("listInventoryEntries", inventoryEntriesService.getAllInventoryEntries());
        return "inventory-entries";  // Use a new view template
    }
}


