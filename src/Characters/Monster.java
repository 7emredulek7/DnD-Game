package Characters;

import Items.Clothing;
import Items.Weapon;

public class Monster extends Character implements Fightable{
    private Weapon weapon;
    private Clothing clothing;

    public Monster(int HP, Weapon weapon, Clothing clothing) {
        super("Monster",HP);
        this.weapon = weapon;
        this.clothing = clothing;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Clothing getClothing() {
        return clothing;
    }

    @Override
    public void attack(Character character) {
        if(clothing.calculateArmor(weapon) < weapon.calculateAttack()) {

            character.setHP(character.getHP() + clothing.calculateArmor(weapon) - weapon.calculateAttack());

        }

        else {
            System.out.println("ARGHHH! How this can happened? I can't break your armor...");
        }
    }

    public void display() {
        System.out.println("Monster : " + "     HP : " + getHP() + "    Armor : " + getClothing().getArmor() + "    Damage : " + getWeapon().getDamage());
    }
}
