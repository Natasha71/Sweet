package com.example.sweetbox;

public class Sweet {
    private String name;
    private double weight;
    private double price;
    private int uniqueParameter;

    public Sweet(String name, double weight, double price, int uniqueParameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueParameter = uniqueParameter;
    }

    // Геттеры (если они вам понадобятся)
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getUniqueParameter() {
        return uniqueParameter;
    }
}

