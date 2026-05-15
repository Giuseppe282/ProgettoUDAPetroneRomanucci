package controller;

import java.io.FileWriter;
import java.util.ArrayList;
import model.Product;
import model.csvReader;

public class ProductManager {

    private ArrayList<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    // Carica i prodotti da un file CSV
    public void loadFromFile(String path) {
        csvReader reader = new csvReader();
        products = reader.readFile(path);
    }

    // Salva i prodotti sul file CSV
    public void saveToFile(String path) throws Exception {
        FileWriter fw = new FileWriter(path);
        fw.write("ID,Name,Category,Brand,Price,Quantity,Supplier\n");
        for (Product p : products) {
            fw.write(p.toString() + "\n");
        }
        fw.close();
    }

    // Restituisce tutti i prodotti
    public ArrayList<Product> getProducts() {
        return products;
    }

    // Aggiunge un prodotto
    public void addProduct(Product p) {
        int newId = 0;
        for (Product p2 : products) {
            if (p2.getId() > newId) {
                newId = p2.getId();
            }
        }
        newId++;
        products.add(new Product(newId, p.getName(), p.getCategory(), p.getBrand(), p.getPrice(), p.getQuantity(), p.getSupplier()));
    }

    // Elimina un prodotto per indice 
    public void removeProduct(int index) {
        products.remove(index);
    }

    // Cerca prodotti per criterio 
    public ArrayList<Product> search(String criterio, String query) {
        String q = query.trim().toLowerCase();
        ArrayList<Product> risultati = new ArrayList<>();

        for (Product p : products) {
            switch (criterio) {
                case "Name":
                    if (p.getName().toLowerCase().contains(q)) {
                        risultati.add(p);
                    }
                    break;
                case "Category":
                    if (p.getCategory().toLowerCase().contains(q)) {
                        risultati.add(p);
                    }
                    break;
                case "Brand":
                    if (p.getBrand().toLowerCase().contains(q)) {
                        risultati.add(p);
                    }
                    break;
                case "Supplier":
                    if (p.getSupplier().toLowerCase().contains(q)) {
                        risultati.add(p);
                    }
                    break;
            }
        }
        return risultati;
    }

    // Controlla se la lista è vuota
    public boolean isEmpty() {
        return products == null || products.isEmpty();
    }
}
