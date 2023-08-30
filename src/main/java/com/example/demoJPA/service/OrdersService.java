package com.example.demoJPA.service;

import com.example.demoJPA.model.Orders;
import com.example.demoJPA.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {
    @Autowired
    OrdersRepository ordersRepository;

    public void createOrder(Orders o){
        ordersRepository.save(o);
    }

    public Orders getOrdersById(int id)
    {
        return this.ordersRepository.findById(id).orElse(null);
    }

    public ArrayList<Orders> getAllOrders(){
        ArrayList<Orders> o = (ArrayList<Orders>) ordersRepository.findAll();
        return o;
    }
    public List<Orders> getAllOrdersByCustomerId(Integer customerId) {
        return ordersRepository.findAllById(Collections.singleton(customerId));

    }


}