package com.capstone.realestate.models;

import lombok.Data;

@Data
public class PropertyFilterData {
    private String category;
    private int minPrice;
    private int maxPrice;
    private int area;
    private int price;
}
