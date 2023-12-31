package com.example.demoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String code;

    String name;

    String description;

    Integer stock;

    Double price;
}
