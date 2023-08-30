package com.example.demoJPA.controller;

import com.example.demoJPA.model.Orders;
import com.example.demoJPA.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    OrdersService ordersService;


    @GetMapping(value="/customer/{id}")
    public List<Orders> getAllOrdersByCustomerId(@PathVariable Integer id){
        return ordersService.getAllOrdersByCustomerId(id);
    }




}
