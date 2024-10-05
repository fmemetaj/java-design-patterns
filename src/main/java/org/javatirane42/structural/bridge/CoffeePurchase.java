package org.javatirane42.structural.bridge;

public class CoffeePurchase implements DrinkPurchase {

    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying a coffee for " + cost);
        return new Coffee();
    }
}
