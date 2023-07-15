package org.adabrain;

public class ThaiCoffee extends Coffee {
    private final String additional;
    public ThaiCoffee(String name, String additional) {
        super(name);
        this.additional = additional;
    }

    @Override
    public void Print() {
        System.out.println("Coffee Name: " + this.getName());
        System.out.println("Additional: " + this.additional);
    }
}
