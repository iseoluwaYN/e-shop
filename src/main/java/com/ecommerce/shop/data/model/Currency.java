package com.ecommerce.shop.data.model;

public enum Currency {
    NGN("Naira"), USD("Dollar"), YEN("Japanese yen"),
    GBP("British pounds"), FRC("France"), GHC("Ghanian Cedis");

    private String name;
    Currency(String s){
        this.name = s;
    }

    public String getName(String name){
        return name;
    }
}
