package org.adabrain;

public class Coffee {
    private String name;
    public Coffee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Print() {
        System.out.println("Coffee name: " + this.name);
    }
}
