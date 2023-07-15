package org.adabrain;

public class PowerUpItem extends Item implements GrabableItem {
    public PowerUpItem(String itemName, int id) {
        super(itemName, id);
        // TODO: Something
    }

    @Override
    public void pickUp() {
        System.out.println(this.itemName + " Picked up!");
    }

    @Override
    public void dropItem() {
        System.out.println(this.itemName + " Drop!");
        System.out.println("Item id: " + this.id + " was destroyed");
    }
}
