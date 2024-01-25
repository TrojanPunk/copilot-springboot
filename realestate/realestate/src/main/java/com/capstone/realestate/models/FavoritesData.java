package com.capstone.realestate.models;

import lombok.Data;
import java.util.List;

@Data
public class FavoritesData {
    private String id;
    private int area;
    private String ratings;
    private String propertyName;
    private int price;
    private List<String> images;
    private Features features;
    private Seller seller;
    private Location location;

}

@Data
class Features {
    private String bhk;
    private String baths;
    private String parking;
}

@Data
class Seller {
    private String sellerName;
    private String sellerMobile;
    private String sellerEmail;
}

@Data
class Location {
    private String city;
    private String pincode;
    private String address;
    private String state;
}
