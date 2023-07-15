package org.adabrain;

public abstract class Item {
    protected String itemName;
    protected int id;


    protected Item(String itemName, int id) {
        this.itemName = itemName;
        this.id = id;
    }
}
