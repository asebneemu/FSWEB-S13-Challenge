package org.example.enums;

public enum Plan {
    BASIC("Temel Plan", 100.0),
    PREMIUM("Özel Plan", 200.0),
    GOLD("Altın Plan", 300.0);

    private final String name;
    private final double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
