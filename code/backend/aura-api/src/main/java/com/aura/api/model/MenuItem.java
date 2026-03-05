package com.aura.api.model;

import jakarta.persistence.*;

@Entity
public class MenuItem {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private double price;

}