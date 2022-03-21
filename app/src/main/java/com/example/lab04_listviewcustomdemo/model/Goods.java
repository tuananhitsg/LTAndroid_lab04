package com.example.lab04_listviewcustomdemo.model;

public class Goods {
    private int id;
    private String name;
    private String shopName;
    private String imageName;
    private double rating;
    private double discount;
    private int vote;
    private double price;

    public Goods(){

    }
    public Goods(String name, String shopName, String imageName) {
        this.name = name;
        this.shopName = shopName;
        this.imageName = imageName;
    }



    public Goods(int id, String name, String imageName, double rating, double discount, int vote, double price) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
        this.rating = rating;
        this.discount = discount;
        this.vote = vote;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
