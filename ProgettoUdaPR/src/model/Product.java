/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author petroner
 */
public class Product {

    private int id;
    private String name, category, brand, supplier;
    private Double price;
    private int quantity;

    public Product(int id, String name, String category, String brand, Double price, int quantity,String supplier) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.supplier = supplier;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    @Override
    public String toString() {
        return id + "," + name + "," + category + "," + brand + "," + price + "," + quantity + "," + supplier;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
