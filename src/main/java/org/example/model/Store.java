package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = {
                new Chocolate("slim", 50, "Slim Chocolate"),
                new Coke("light", 20, "Light Coke"),
                new Bread("sour", 5, "Sour Bread")
        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}