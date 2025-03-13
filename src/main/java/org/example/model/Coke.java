package org.example.model;

public class Coke extends ProductForSale {
    private String name;

    public Coke(String type, int price, String description) {
        super(type, price, description);
        name = "Coke";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Name: " + name +
                " Type: " + getType() +
                " Price: " + getPrice() +
                " Description: " + getDescription());
    }
}
