package org.practice;
import org.practice.model.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product = new Product(1, "Banan", 2.00, 2000);
        System.out.println(product.toString());
    }
}