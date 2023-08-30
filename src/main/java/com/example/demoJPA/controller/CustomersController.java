package com.example.demoJPA.controller;

import com.example.demoJPA.dto.PostalDetailsUserDTO;
import com.example.demoJPA.model.Customers;
import com.example.demoJPA.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersController {
    @Autowired
    CustomersService customersService;
    @GetMapping
    public List<Customers> getAllCustomers(){
        return customersService.getAllCustomers();
    }

    @GetMapping(value="/{id}")
    public Customers getCustomersById(@PathVariable Integer id){
        return customersService.getCustomersById(id);
    }

    @PostMapping
    public List<Customers> CreateCustomer(Customers customers){
        customersService.CreateCustomer(customers);
        return customersService.getAllCustomers();
    }
    @GetMapping(value="username/{username}")
    public PostalDetailsUserDTO getPostalDetailsUserDTO(@PathVariable String username){
        return customersService.getPostalDetailsUserDTO(username);
    }


}
