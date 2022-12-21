package Inventory;

import Items.Item;

import java.util.ArrayList;
public class Inventory {

    private ArrayList<Item> items;

    public Inventory(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void display() {
        System.out.println("Items");
        System.out.println("-----");

        for(int i = 0; i < items.size() ; i++) {
            System.out.print((i+1) + "-) ");
            items.get(i).display();
        }
    }


}