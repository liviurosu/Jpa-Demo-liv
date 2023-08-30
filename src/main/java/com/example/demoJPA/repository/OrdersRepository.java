package com.example.demoJPA.repository;

import com.example.demoJPA.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    @Query(nativeQuery = true, value = "select * from orders where orders.customer_id =:id")
    ArrayList<Orders> getAllOrdersById(@Param("id") int id);
}
