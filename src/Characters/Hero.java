package Characters;
import Inventory.HeroInventory;
import Items.Clothing;
import Items.Weapon;
import Levels.Corridor;
import Levels.Level;
import Levels.Room;

import java.util.Scanner;

public class Hero extends Character implements Fightable{

    private Weapon weapon;
    private Clothing clothing;
    private Room room;
    private Corridor corridor;
    private Level level;
    private HeroInventory heroInventory;
    private static int score = 0;


    public Hero() {
        super("Hero",100);
        this.weapon = getWeapon();
        this.clothing = getClothing();
        this.room = getRoom();
        this.corridor = getCorridor();
        this.level = getLevel();
        this.heroInventory = getHeroInventory();
    }

    public Hero(String name, Weapon weapon, Clothing clothing, Level level, Corridor corridor, Room room, HeroInventory heroInventory) {
        super(name,100);
        this.weapon = weapon;
        this.clothing = clothing;
        this.level = level;
        this.corridor = corridor;
        this.room = room;
        this.heroInventory = heroInventory;

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Corridor getCorridor() {
        return corridor;
    }

    public void setCorridor(Corridor corridor) {
        this.corridor = corridor;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public HeroInventory getHeroInventory() {
        return heroInventory;
    }

    public static void setScore(int score) {
        Hero.score = score;
    }

    public static int getScore() {
        return score;
    }

    public void heal(int healAmount) {

        if (getHP()<= 100 && getHP() >= 0) {
            setHP(getHP() + healAmount);
            System.out.println("Townspeople healed Hero " + getName());
        }
        if(getHP() > 100) {
            setHP(100);
            System.out.println("HP is full.");
        }
    }

    @Override
    public void attack(Character character) {
        if(clothing.calculateArmor(weapon) < weapon.calculateAttack()) {
            character.setHP(character.getHP() + clothing.calculateArmor(weapon) - weapon.calculateAttack());

            if(character.getHP() <= 0) {
                System.out.println("YOU KILLED THE MONSTER ! ");
            }

            else {
                System.out.println(character.getName() + " has " + character.getHP() + " HP");
            }
        }

        else {
            System.out.println("This armor is unbreakable. You must find a more powerful weapon.");
        }
    }


    public void forwardRoom() {
        setRoom(getRoom().getNextRoom());
    }

    public void backRoom() {
        setRoom(getRoom().getPreRoom());
    }

    public void forwardCorridor() {
        setCorridor(getCorridor().getNextCorridor());
    }

    public void backCorridor() {
        setCorridor(getCorridor().getPreCorridor());
    }

    public void forwardLevel() {
        setLevel(getLevel().getNextLevel());
    }

    public void backLevel() {
        setLevel(getLevel().getPreLevel());
    }

    public void pickItem() {
        while (true) {

            if(getRoom().getInventory().getItems().size() == 0) {
                System.out.println("There is no item in this room.");
                break;
            }

            System.out.println("Which one do you want to pick? (Enter 1000 for quit)");
            getRoom().getInventory().display();

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if(choice == 1000) {
                break;
            }

            if ((choice <= getRoom().getInventory().getItems().size())) {
                getHeroInventory().addItem(getRoom().getInventory().getItems().get((choice - 1)));
                getRoom().getInventory().getItems().remove(choice-1);
                break;
            }
            else {
                System.out.println("There is no item. Enter again.");
            }

        }
    }

    public void changeItem() {

        while (true) {

            System.out.println("Which one do you want to wear? (Press 1000 for quit)");
            getHeroInventory().display();

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if(choice == 1000) {
                break;
            }

            else {
                if(heroInventory.getItems().get(choice - 1) instanceof Weapon) {
                    heroInventory.addItem(weapon);

                    weapon = (Weapon) heroInventory.getItems().get(choice -1);
                    heroInventory.getItems().remove(choice-1);
                    break;
                }

                else if(heroInventory.getItems().get(choice - 1) instanceof Clothing) {
                    heroInventory.addItem(clothing);

                    clothing = (Clothing) heroInventory.getItems().get(choice -1);
                    heroInventory.getItems().remove(choice-1);
                    break;
                }
                else {
                    System.out.println("There is no item. Pick again.");
                }
            }
        }
    }

    public void dropItem() {


        System.out.println("Which one do you want to drop? (Press 1000 for quit)");
        getHeroInventory().display();

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1000) {

        }

        else if(heroInventory.getItems().size() == 0) {
            System.out.println("There is no item in the inventory.");

        }

        else {
            room.getInventory().addItem(heroInventory.getItems().get(choice -1));
            heroInventory.getItems().remove(choice-1);
            System.out.println("Item deleted. You can take it from room again.");
        }
    }


    public void display() {
        System.out.println("\nHero " + getName() + "    HP : " + getHP() +
                "   Room " + getRoom().getRoomNumber() + " , Corridor " + getCorridor().getCorridorNumber() + " , Level " + getLevel().getLevelNumber()
                + "     Weapon : " + getWeapon().getName() + "     Clothing : " + getClothing().getName() + "\n");
    }
}
