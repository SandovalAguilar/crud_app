package com.crudwebapp.dev.controller;

import com.crudwebapp.dev.service.InventoryPendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InventoryPendingController {

    @Autowired
    private InventoryPendingService inventoryPendingService; 

    @GetMapping("/inventory-pending")
    public String viewInventoryPending(Model model) {
        model.addAttribute("listInventoryPending", inventoryPendingService.getAllInventoryPending());
        return "inventory-pending";  // Use the corresponding view
    }
}
