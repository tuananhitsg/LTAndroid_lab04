package com.example.lab04_listviewcustomdemo.model;

public class Goods {
    private String name;
    private String shopName;
    private String imageName;

    public Goods(String name, String shopName, String imageName) {
        this.name = name;
        this.shopName = shopName;
        this.imageName = imageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
