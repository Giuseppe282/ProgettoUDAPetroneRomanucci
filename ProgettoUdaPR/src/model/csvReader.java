/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Riccardo Petrone
 */
public class csvReader {
    ArrayList<Product> products;

    public csvReader() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> readFile(String filename) {

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = null;
            String label = br.readLine();

            while ((line = br.readLine()) != null) {
                String info[] = line.split(",");
                
                int id = Integer.parseInt(info[0]);
                String name = info[1];
                String category = info[2];
                String brand = info[3];
                Double price = Double.valueOf(info[4]);
                int quantify = Integer.parseInt(info[5]);
                String supplier = info[6];
                
                
                products.add(new Product(id, name, category, brand, price, quantify, supplier));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

}
