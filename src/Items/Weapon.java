package Items;

public abstract class Weapon extends Item {

    private int damage;
    private int range;
    private int block;

    public Weapon(String name, int weight, int value, int damage, int range, int block) {
        super(name, weight, value);
        this.damage = damage;
        this.range = range;
        this.block = block;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public int getBlock() {
        return block;
    }

    public abstract int calculateAttack();

    @Override
    public void display() {
        super.display();
        System.out.println("Damage : " + getDamage());
        System.out.println("Range : " + getRange());
        System.out.println("Block : " + getBlock());
        System.out.println("---------------");
    }

}
