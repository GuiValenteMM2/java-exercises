package org.practice.model;

public class Product {
    private int id;
    private String name;
    private Double price;
    private int quantity;

    public Product(int id, String name, Double price, int quantity) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "This is a ".concat(this.getName()).concat(". It's price is: ")
                .concat(this.getPrice().toString()).concat(" and we have:") + this.getQuantity();
    }
}
