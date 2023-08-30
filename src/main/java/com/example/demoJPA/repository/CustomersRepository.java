package com.example.demoJPA.repository;

import com.example.demoJPA.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {

    @Query(value = "SELECT c FROM Customers c WHERE c.username = :username")
    Customers findByName(String username);

}
