package com.example.demoJPA.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderDetails {
    @Id
    @GeneratedValue
    Integer id;

    Integer quantity;

    Double priceEach;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "order_id", nullable = false)
    Orders orders;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "product_code", nullable = false)
    Products products;
}
