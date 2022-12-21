package Items;

public class Axe extends Weapon {

    public Axe(String name, int weight, int value, int damage, int range, int block) {
        super(name, weight, value, damage, range, block);
    }

    @Override
    public int calculateAttack() {
        return getDamage() + getRange()/4;
    }
}
