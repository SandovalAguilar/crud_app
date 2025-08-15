package com.crudwebapp.dev.controller;

import com.crudwebapp.dev.service.InventoryOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InventoryOrdersController {

    @Autowired
    private InventoryOrdersService inventoryOrderService;

    // This endpoint will insert sample orders into the database
    @GetMapping("/add-inventory-orders")
    public String addInventoryOrders() {
        inventoryOrderService.getAllInventoryOrders();
        return "redirect:/inventory-orders"; // Redirect to the page that shows the orders
    }
}
