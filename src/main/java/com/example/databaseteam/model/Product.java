package com.example.databaseteam.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor//...
@NoArgsConstructor//...
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 500)
    private String title;

    @Column(length = 5000)
    private String description;

    private Double price;

    private int stock;

    private String image;

    private int discount;

    private Double discountPrice;

}
