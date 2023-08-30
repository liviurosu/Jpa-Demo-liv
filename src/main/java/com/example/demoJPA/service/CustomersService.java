package com.example.demoJPA.service;

import com.example.demoJPA.dto.PostalDetailsUserDTO;
import com.example.demoJPA.model.Customers;
import com.example.demoJPA.model.Products;
import com.example.demoJPA.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomersService {
    @Autowired
    CustomersRepository customersRepository;

    public void CreateCustomer(Customers c){
        customersRepository.save(c);
    }
    public ArrayList<Customers> getAllCustomers(){
        ArrayList<Customers> c = (ArrayList<Customers>) customersRepository.findAll();
        return c;
    }

    public  Customers getCustomersById(Integer id) {
        return (Customers) customersRepository.findById(id).orElse(null);

    }
    public PostalDetailsUserDTO getPostalDetailsUserDTO(String username){
        Customers c = customersRepository.findByName(username);
        System.out.println(c);
        PostalDetailsUserDTO postalDetailsUserDTO = new PostalDetailsUserDTO();
        postalDetailsUserDTO.setAddress(c.getAddress());
        postalDetailsUserDTO.setCity(c.getCity());
        postalDetailsUserDTO.setPhone(c.getPhone());

        return postalDetailsUserDTO;
    }

}
