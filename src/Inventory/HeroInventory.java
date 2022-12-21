package Inventory;


import Items.Item;
import java.util.ArrayList;

public class HeroInventory extends Inventory {

    private final int capacity;

    public HeroInventory(ArrayList<Item> items) {
        super(items);
        this.capacity = 100;
    }

    private int getTotalWeight() {

        int totalWeight = 0;

        for(int i = 0 ; i < getItems().size() ; i++) {
            totalWeight += getItems().get(i).getWeight();
        }

        return totalWeight;
    }

    public int calculateRemainingCapacity() {

        return capacity - getTotalWeight();
    }

    @Override
    public void addItem(Item item) {
        if(item.getWeight() <= calculateRemainingCapacity()) {
            super.addItem(item);
            System.out.println("Item added.");
        }

        else {
            System.out.println("You have no capacity.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Remaining Capacity : " + calculateRemainingCapacity());

    }
}
