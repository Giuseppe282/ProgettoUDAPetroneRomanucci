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

    public Product(int id, String name, String category, String brand, String supplier, Double price, int quantity) {
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
}
