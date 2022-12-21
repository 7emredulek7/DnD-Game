package Levels;
import Characters.Monster;
import Characters.Townspeople;
import Inventory.Inventory;

import java.util.ArrayList;

public class Room implements Displayable{

    private final int roomNumber;
    private ArrayList<Monster> monsters;
    private ArrayList<Townspeople> townspeople;
    private Inventory inventory;
    private Room nextRoom;
    private Room preRoom;

    public Room(int roomNumber, ArrayList<Monster> monsters, ArrayList<Townspeople> townspeople, Inventory inventory) {
        this.roomNumber = roomNumber;
        this.monsters = monsters;
        this.townspeople = townspeople;
        this.inventory = inventory;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public ArrayList<Townspeople> getTownspeople() {
        return townspeople;
    }

    public Inventory getInventory() {
        return inventory;
    }


    public Room getNextRoom() {
        return nextRoom;
    }

    public void setNextRoom(Room nextRoom) {
        this.nextRoom = nextRoom;
    }

    public Room getPreRoom() {
        return preRoom;
    }

    public void setPreRoom(Room preRoom) {
        this.preRoom = preRoom;
    }

    public void dropItem(Monster monster) {

        inventory.addItem(monster.getWeapon());
        inventory.addItem(monster.getClothing());

        System.out.println("Monster dropped an item!");
    }

    @Override
    public void display() {

        if(monsters.size() != 0) {
            System.out.println("There is " + monsters.size() + " monsters and " + townspeople.size() + " townspeople in this room.");
        }

        else {
            System.out.println("This room is empty.");
        }
    }
}
