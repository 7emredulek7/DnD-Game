import Items.*;
import Levels.*;
import Inventory.*;
import Characters.*;

import java.io.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        ArrayList<Weapon> weapons = new ArrayList<>();
        ArrayList<Clothing> clothing = new ArrayList<>();

        //Weapon generation
        //name,weight,value,damage,range,block
        weapons.add(new Sword("Plastic Sword", 1, 0, 6, 6, 3));
        weapons.add(new Bow("Plastic Bow", 1, 0, 4, 8, 2));
        weapons.add(new Axe("Plastic Axe", 1, 0, 8, 4, 4));
        weapons.add(new Sword("Wood Sword", 3, 2, 12, 6, 4));
        weapons.add(new Bow("White Ash Bow", 2, 2, 10, 8, 3));
        weapons.add(new Axe("Wood Axe", 4, 2, 14, 4, 5));
        weapons.add(new Sword("Stone Sword", 6, 6, 18, 6, 5));
        weapons.add(new Bow("Elm Bow", 5, 6, 16, 8, 4));
        weapons.add(new Axe("Stone Axe", 7, 6, 20, 4, 6));
        weapons.add(new Sword("Copper Sword", 10, 12, 24, 6, 6));
        weapons.add(new Bow("Oak Bow", 9, 12, 22, 8, 5));
        weapons.add(new Axe("Copper Axe", 11, 12, 26, 4, 7));
        weapons.add(new Sword("Silver Sword", 14, 24, 30, 6, 8));
        weapons.add(new Bow("Maple Bow", 13, 24, 28, 8, 7));
        weapons.add(new Axe("Iron Axe", 15, 24, 32, 4, 9));
        weapons.add(new Sword("Iron Sword", 18, 36,36 , 8, 9));
        weapons.add(new Bow("Beach Bow", 17, 36, 34, 12, 8));
        weapons.add(new Axe("Gold Axe", 19, 36, 38, 6, 10));
        weapons.add(new Sword("Gold Sword", 21, 44, 42, 8, 10));
        weapons.add(new Bow("Hickory Bow", 20, 44, 40, 12, 9));
        weapons.add(new Axe("Titanium Axe", 22, 44, 44, 6, 11));
        weapons.add(new Sword("Titanium Sword", 24, 60, 48, 8, 11));
        weapons.add(new Bow("Metal Crossbow", 23, 60, 46, 12, 10));
        weapons.add(new Axe("Steel Axe", 25, 60, 50, 6, 12));
        weapons.add(new Sword("Steel Sword", 27, 70, 54, 8, 13));
        weapons.add(new Bow("Silver Crossbow", 26, 70, 52, 12, 12));
        weapons.add(new Axe("Stainless Steel Axe", 28, 70, 56, 6, 14));
        weapons.add(new Sword("Stainless Steel Sword", 30, 88, 60, 8, 14));
        weapons.add(new Bow("Iron Crossbow", 29, 88, 58, 12, 13));
        weapons.add(new Axe("Two Handed Copper Axe", 31, 88, 62, 6, 15));
        weapons.add(new Sword("Silver Katana", 33, 96, 66, 10,15));
        weapons.add(new Bow("Stainless Steel Crossbow", 32, 96, 64, 16, 14));
        weapons.add(new Axe("Two Handed Iron Axe", 34, 96, 68, 8, 16));
        weapons.add(new Sword("Iron Katana", 36, 120, 72, 10, 16));
        weapons.add(new Bow("Two Arrow Metal Crossbow", 35,120 , 70, 16, 15));
        weapons.add(new Axe("Two Handed Gold Axe", 37, 120, 74, 8, 17));
        weapons.add(new Sword("Gold Katana", 40, 160, 78, 10, 18));
        weapons.add(new Bow("Two Arrow Silver Crossbow", 39, 160, 76, 16, 17));
        weapons.add(new Axe("Two Handed Titanium Axe", 41, 160,80 , 8, 19));
        weapons.add(new Sword("Steel Katana", 44, 200, 84, 10, 19));
        weapons.add(new Bow("Two Arrow Iron Crossbow", 43, 200, 82, 16, 18));
        weapons.add(new Axe("Two Handed Steel Axe", 45, 200,86 , 8, 20));
        weapons.add(new Sword("Stainless Steel Katana", 47, 250, 90, 10, 20));
        weapons.add(new Bow("Two Arrow Stainless Steel Crossbow", 46, 250, 88, 16, 19));
        weapons.add(new Axe("Two Handed Stainless Steel Axe", 48, 250, 92, 8, 21));
        weapons.add(new Sword("HUGE SWORD", 50, 300, 96, 14, 21));
        weapons.add(new Axe("HUGE AXE", 50, 300, 98, 10, 22));
        weapons.add(new Bow("HUGE BOW", 50, 300, 94, 20, 20));


        //Clothing generation
        //name, weight, value, armor
        clothing.add(new Clothing("Leather Armor Set", 2, 0, 2));
        clothing.add(new Clothing("Gambeson ", 3, 3, 3));
        clothing.add(new Clothing("Boiled Leather Armor Set", 4, 5, 4));
        clothing.add(new Clothing("Shell Armor Set", 5, 10,6 ));
        clothing.add(new Clothing("Scale Armor Set", 6, 14, 7));
        clothing.add(new Clothing("Lamellar Armor Set", 7, 17, 8));
        clothing.add(new Clothing("Laminar Armor Set", 8, 20, 10));
        clothing.add(new Clothing("Plated Armor Set", 10, 25, 11));
        clothing.add(new Clothing("Brigandine Armor Set", 12, 30, 12));
        clothing.add(new Clothing("Plated Mail Armor Set", 13, 35, 14));
        clothing.add(new Clothing("Full Mail Armor Set", 15, 40, 15));
        clothing.add(new Clothing("Chain Armor Set", 16, 43, 16));
        clothing.add(new Clothing("Brigand Armor Set", 17, 47, 18));
        clothing.add(new Clothing("Fire Keeper Set", 18, 49, 19));
        clothing.add(new Clothing("Faraam Armor Set", 19, 53, 20));
        clothing.add(new Clothing("Alva Armor Set", 20, 57, 22));
        clothing.add(new Clothing("DrakeBlood Armor Set ", 21, 61, 23));
        clothing.add(new Clothing("Drang Armor Set", 22, 65, 24));
        clothing.add(new Clothing("Archdeacon Armor Set", 23, 68, 26));
        clothing.add(new Clothing("Dragon Scale Armor Set", 25, 72, 27));
        clothing.add(new Clothing("Mirrah Armor Set", 26, 76, 28));
        clothing.add(new Clothing("Armor of Favor Set", 27, 81, 30));
        clothing.add(new Clothing("Armor of the Sun Set", 28, 86, 31));
        clothing.add(new Clothing("Dragon Slayer Set", 29, 90, 32));
        clothing.add(new Clothing("Eastern Armor Set", 30, 95, 34));
        clothing.add(new Clothing("Morne's Armor Set", 31, 100, 35));
        clothing.add(new Clothing("Armor of the Throns Set", 32, 104, 36));
        clothing.add(new Clothing("Elite Knight Set", 33, 108, 38));
        clothing.add(new Clothing("Nameless Knight Armor Set", 35, 113, 39));
        clothing.add(new Clothing("Northern Armor Set", 34, 117, 40));
        clothing.add(new Clothing("Executioner Armor Set", 35, 121, 42));
        clothing.add(new Clothing("Black Knight Armor Set", 36, 125, 43));
        clothing.add(new Clothing("Exile Armor Set", 37, 130, 44));
        clothing.add(new Clothing("Outrider Armor Set", 38, 134, 46));
        clothing.add(new Clothing("Fallen Knight Armor Set", 39, 139, 47));
        clothing.add(new Clothing("Pontiff Knight Armor Set", 40, 144, 48));
        clothing.add(new Clothing("Brass Armor Set", 41, 148, 50));
        clothing.add(new Clothing("Fire Witch Armor Set", 42, 153, 51));
        clothing.add(new Clothing("Firelink Armor Set", 43, 157, 52));
        clothing.add(new Clothing("Catarina Armor Set", 44, 160, 54));
        clothing.add(new Clothing("Cathedral Knight Armor Set", 45, 170, 55));
        clothing.add(new Clothing("Winged Knight Armor Set", 46, 185, 56));
        clothing.add(new Clothing("Wolf Knight Armor Set", 47, 200, 57));
        clothing.add(new Clothing("Lothric Knight Armor Set", 48, 225, 58));
        clothing.add(new Clothing("Xanthous Armor Set",49 , 250, 59));
        clothing.add(new Clothing("Undead Legion Armor Set", 50, 300, 60));
        clothing.add(new Clothing("HUGE ARMOR", 50, 300, 60));
        clothing.add(new Clothing("BOSS ARMOR", 50, 300, 60));

        //Level, Corridor, Room Generation
        Level levels[] = new Level[15];

        for (int i = 0; i < levels.length; i++) { //Level creation
            Corridor[] corridors = new Corridor[(secureRandom.nextInt(2) + 2)];

            for (int j = 0; j < corridors.length; j++) { //Corridor creation
                Room[] rooms = new Room[(secureRandom.nextInt(3) + 3)];

                for (int k = 0; k < rooms.length; k++) { //Room Creation
                    rooms[k] = new Room((k + 1), new ArrayList<>(), new ArrayList<>(), new Inventory(new ArrayList<>()));

                    for (int z = 0; z <= secureRandom.nextInt(3); z++) { // Adding monsters in the room
                        rooms[k].getMonsters().add(new Monster(secureRandom.nextInt(1 + 10 * i) + 10, weapons.get((i + 1) * secureRandom.nextInt(3)), clothing.get((i + 1) * secureRandom.nextInt(3))));
                    }

                    if(rooms[k].getMonsters().size() == 1 || rooms[k].getMonsters().size() == 2) { //Townspeople creation
                        rooms[k].getTownspeople().add(new Townspeople());
                    }

                    if(rooms[k].getMonsters().size() == 3) {
                        rooms[k].getTownspeople().add(new Townspeople());
                        rooms[k].getTownspeople().add(new Townspeople());
                    }
                }

                for (int l = 1; l < rooms.length - 1; l++) {
                    rooms[l].setPreRoom(rooms[l - 1]);
                    rooms[l].setNextRoom(rooms[l + 1]);
                }

                rooms[0].setNextRoom(rooms[1]); //Creating first and second room
                rooms[rooms.length - 1].setPreRoom(rooms[rooms.length - 2]);

                corridors[j] = new Corridor((j + 1), rooms);
            }
            corridors[0].setNextCorridor(corridors[1]);
            corridors[corridors.length - 1].setPreCorridor(corridors[corridors.length - 2]);

            for (int c = 1; c < corridors.length - 1; c++) {
                corridors[c].setPreCorridor(corridors[c - 1]);
                corridors[c].setNextCorridor(corridors[c + 1]);
            }
            levels[i] = new Level((i + 1), corridors);
        }

        levels[0].setNextLevel(levels[1]);
        levels[levels.length - 1].setPreLevel(levels[levels.length - 2]);

        for (int i = 1; i < levels.length - 1; i++) {
            levels[i].setPreLevel(levels[i - 1]);
            levels[i].setNextLevel(levels[i + 1]);
        }


        System.out.println("*** Before Starting ***");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("At the end of the game, the townspeople that you saved and your item's value will be your score.");
        System.out.println("You can drop item with killing monster.");
        System.out.println("You can save the townspeople by killing ALL the monsters in the room.");
        System.out.println("You can't carry more than 100 weight in your inventory.");
        System.out.println("Weapon's range value can increase your attack, and weapon's block value can increase your armor.");
        System.out.println("--------------------------------------------------------------------------------------------------\n");


        System.out.println("*** Controls ***");
        System.out.println("---------------------------------------");
        System.out.println("Attack --> attack");
        System.out.println("Go forward to room --> forward R");
        System.out.println("Go back to room --> back R");
        System.out.println("Go forward to corridor --> forward C");
        System.out.println("Go back to corridor --> back C");
        System.out.println("Go forward to level --> forward l");
        System.out.println("Go back to level --> back L");
        System.out.println("Look items in room --> look items");
        System.out.println("Look items in inventory --> look my items");
        System.out.println("Change item --> change item");
        System.out.println("Drop item --> drop item");
        System.out.println("---------------------------------------\n");

        System.out.println("Enter a nickname");
        String tempName = input.nextLine();

        //Hero Generation
        Hero hero = new Hero(tempName, weapons.get(0), clothing.get(0), levels[0], levels[0].getCorridors()[0], levels[0].getCorridors()[0].getRooms()[0], new HeroInventory(new ArrayList<>()));

        System.out.println("\nYou woke up in anger. Where did this anger come from? You suddenly remembered all the bitter truths. Your hands started to tremble. You were full of vengeance.\nThose creatures killed and kidnapped the people in your village. And most importantly, they took your partner from you and tortured them. You were raging with anger. Now your partner is just a memory.\nYou had to get your revenge on those scumbags. You had to enter the black tower where those creatures came from and slay them until there was not a single one left.\nYou immediately got up and went to the village headquarters and bought yourself a weapon and armor from there. And you set off...");
        while (hero.getHP() > 0) {

            hero.display();

            hero.getRoom().display();
            System.out.println("\nChoose an action : ");

            String action;
            action = input.nextLine();

            switch (action) {
                case "attack":

                    if (hero.getRoom().getMonsters().size() == 0) {
                        System.out.println("There is no monsters in the room. Please choose another action.");
                        break;
                    }
                    for (int i = 0; i < hero.getRoom().getMonsters().size(); i++) { //Display Monsters
                        System.out.print((i + 1) + ".");
                        hero.getRoom().getMonsters().get(i).display();
                    }

                    System.out.println("Pick a monster : ");
                    int choice = input.nextInt();
                    input.nextLine();

                    if (choice > hero.getRoom().getMonsters().size() || choice < 1) { //Null controller for monster
                        System.out.println("There is no monster like this.");
                    } else { // attack
                        hero.attack(hero.getRoom().getMonsters().get(choice - 1));
                        hero.getRoom().getMonsters().get(choice - 1).attack(hero);

                        for (int i = 0; i < hero.getRoom().getMonsters().size(); i++) { //If monster dies

                            if (hero.getRoom().getMonsters().get(i).getHP() <= 0) {
                                hero.getRoom().dropItem(hero.getRoom().getMonsters().get(i));
                                hero.getRoom().getMonsters().remove(i);

                                if (hero.getRoom().getMonsters().size() == 0) {
                                    System.out.println("You killed all the monsters in this room. The townspeople are grateful to you and they are healing you.");

                                    for (int j = 0; j < hero.getRoom().getTownspeople().size(); j++) {
                                        hero.heal(hero.getRoom().getTownspeople().get(j).getHealAmount());
                                        Hero.setScore(Hero.getScore() + 1);
                                    }
                                }
                            }
                        }
                    }
                    break;

                case "look items":

                    if (hero.getRoom().getInventory().getItems() == null) { // Null controller for inventory
                        System.out.println("There is no item in this room.");
                    } else {
                        hero.pickItem();
                    }
                    break;

                case "look my items":

                    if (hero.getHeroInventory().getItems().size() == 0) { // Null controller for hero inventory
                        System.out.println("There is no item in the inventory.");
                    } else {
                        hero.getHeroInventory().display();
                    }
                    break;

                case "forward R":
                    if (hero.getRoom().getNextRoom() == null) { //Null controller for next room.
                        System.out.println("This is the last room. You can go forward to next corridor.");
                    } else {
                        hero.forwardRoom();
                    }
                    break;

                case "back R":
                    if (hero.getRoom().getPreRoom() == null) { //Null controller for previous room
                        System.out.println("There is no room in the back. You can go back to previous corridor.");
                    } else {
                        hero.backRoom();
                    }
                    break;

                case "forward C":
                    if (hero.getCorridor().getNextCorridor() == null) {
                        System.out.println("This is the last corridor. You can go forward to next level");
                    } else if (hero.getRoom().getRoomNumber() != hero.getCorridor().getRooms().length) {
                        System.out.println("You must go to last room for forward to next corridor.");
                    } else {
                        hero.forwardCorridor();
                        hero.setRoom(hero.getCorridor().getRooms()[secureRandom.nextInt(hero.getCorridor().getRooms().length)]);
                    }
                    break;

                case "back C":
                    if (hero.getCorridor().getPreCorridor() == null) {
                        System.out.println("There is no corridor in the back. You can go back to last level.");
                    } else if (hero.getRoom().getRoomNumber() != 1) {
                        System.out.println("You must go to first room for go back to previous corridor.");
                    } else {
                        hero.backCorridor();
                        hero.setRoom(hero.getCorridor().getRooms()[secureRandom.nextInt(hero.getCorridor().getRooms().length)]);
                    }
                    break;

                case "forward L":
                    if (hero.getLevel().getNextLevel() == null) {
                        System.out.println("This is the last level. CONGRATULATIONS!");
                    } else if (hero.getCorridor().getCorridorNumber() != hero.getLevel().getCorridors().length && hero.getRoom().getRoomNumber() != hero.getCorridor().getRooms().length) {
                        System.out.println("You must go to last room in the last corridor for passing level. ");
                    } else {
                        hero.forwardLevel();
                        hero.setCorridor(hero.getLevel().getCorridors()[0]);
                        hero.setRoom(hero.getCorridor().getRooms()[0]);
                    }
                    break;

                case "back L":
                    if (hero.getLevel().getPreLevel() == null) {
                        System.out.println("This is the first level. You can't go down from here. ");
                    } else if (hero.getCorridor().getCorridorNumber() != 1 && hero.getRoom().getRoomNumber() != 1) {
                        System.out.println("You must go to first room in the first corridor for go back to previous level.");
                    } else {
                        hero.backLevel();
                        hero.setCorridor(hero.getLevel().getCorridors()[0]);
                        hero.setRoom(hero.getCorridor().getRooms()[0]);
                    }
                    break;

                case "change item":
                    hero.changeItem();
                    break;

                case "drop item":
                    hero.dropItem();
                    break;
            }
        }

        for (int i = 0; i < hero.getHeroInventory().getItems().size(); i++) {
            Hero.setScore(Hero.getScore() + hero.getHeroInventory().getItems().get(i).getValue() + hero.getWeapon().getValue() + hero.getClothing().getValue());
        }

        System.out.println("YOU DIED.");
        System.out.println("Your score : " + Hero.getScore());

        ArrayList<HighScore> highScores = new ArrayList<>();

        File scores = new File("Scores.txt");

        FileWriter fWriter = new FileWriter(scores, true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        FileReader fileReader = new FileReader(scores);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int scoreCounter = 0;

        while (bufferedReader.readLine() != null) {
            scoreCounter++;
        }

        bufferedReader.close();

        if (scoreCounter < 5) {
            bWriter.write(hero.getName() + ", " + Hero.getScore());
            bWriter.newLine();
            bWriter.close();

            System.out.println("You must play at least 5 times for see high scores.");
        }

        else {

            FileReader fileReader1 = new FileReader(scores);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

            String line;
            while ((line = bufferedReader1.readLine()) != null) {

                String[] str2 = line.split(", ");
                highScores.add(new HighScore(str2[0], Integer.parseInt(str2[1]))); //Transporting the file content into an arraylist
            }

            bufferedReader1.close();

            highScores.add(new HighScore(hero.getName(), Hero.getScore()));

            for(int i = 0 ; i < highScores.size() ; i++) {

                for(int j = 0 ; j < highScores.size() ; j++) {

                    if(highScores.get(i).getScore() > highScores.get(j).getScore()) {
                        HighScore temp = highScores.get(i);
                        highScores.set(i, highScores.get(j));
                        highScores.set(j,temp);
                    }
                }
            }

            highScores.remove(highScores.size()-1); // Deleting 6. score in the scores.
            scores.delete();

            FileWriter fWriter1 = new FileWriter(scores, true);
            BufferedWriter bWriter1 = new BufferedWriter(fWriter1);

            for (HighScore highScore : highScores) {
                bWriter1.write(highScore.getName() + ", " + highScore.getScore());
                bWriter1.newLine();
            }

            bWriter1.close();

            System.out.println("\nHIGH SCORES\n");

            for (HighScore highScore : highScores) {
                System.out.println(highScore.getName() + ", " + highScore.getScore());
            }

        }

    }
}
