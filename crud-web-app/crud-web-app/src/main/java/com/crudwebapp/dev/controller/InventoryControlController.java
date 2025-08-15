package com.crudwebapp.dev.controller;

import com.crudwebapp.dev.service.InventoryControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InventoryControlController {

    @Autowired
    private InventoryControlService inventoryControlService;

    // Display list of Inventory Controls
    @GetMapping("/inventory-control")
    public String viewInventoryControl(Model model) {
        model.addAttribute("listInventoryControls", inventoryControlService.getAllInventoryControls());
        return "inventory-control"; // Name of the Thymeleaf template
    }
}
