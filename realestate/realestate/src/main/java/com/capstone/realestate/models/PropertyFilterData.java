package com.capstone.realestate.models;

import lombok.Data;

@Data
public class PropertyFilterData {
    private String category;
    private double minPrice;
    private double maxPrice;
    private double area;
    private double price;
}
