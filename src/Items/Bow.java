package Items;

public class Bow extends Weapon {

    public Bow(String name, int weight, int value, int damage, int range, int block) {
        super(name, weight, value, damage, range, block);
    }

    @Override
    public int calculateAttack() {
        return getDamage() + getRange()/2;
    }
}
