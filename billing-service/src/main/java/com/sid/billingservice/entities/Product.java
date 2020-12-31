package com.sid.billingservice.entities;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private double price;
}
