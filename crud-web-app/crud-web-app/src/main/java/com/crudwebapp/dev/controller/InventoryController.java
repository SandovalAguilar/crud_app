package com.crudwebapp.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.crudwebapp.dev.service.InventoryEntriesService;
import com.crudwebapp.dev.service.InventoryOrdersService;
import com.crudwebapp.dev.service.InventoryOutputsService;
import com.crudwebapp.dev.service.InventoryPendingService;
import com.crudwebapp.dev.service.InventoryControlService;

@Controller
public class InventoryController {

    @Autowired
    private InventoryEntriesService inventoryEntriesService;

    @Autowired
    private InventoryOutputsService inventoryOutputsService;
    
    @Autowired
    private InventoryControlService inventoryControlService;
    
    @Autowired
    private InventoryOrdersService inventoryOrdersService;
    
    @Autowired
    private InventoryPendingService inventoryPendingService;

    @GetMapping("/")
    public String viewInventory(Model model) {
        // Fetch the lists from all services
        model.addAttribute("listInventoryEntries", inventoryEntriesService.getAllInventoryEntries());
        model.addAttribute("listInventoryOutputs", inventoryOutputsService.getAllInventoryOutputs());
        model.addAttribute("listInventoryControls", inventoryControlService.getAllInventoryControls());
        model.addAttribute("listInventoryOrders", inventoryOrdersService.getAllInventoryOrders());
        model.addAttribute("listInventoryPending", inventoryPendingService.getAllInventoryPending());
        return "index";  // Return the combined HTML page with both lists
    }
}
