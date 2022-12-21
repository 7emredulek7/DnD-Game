package Items;

public class Clothing extends Item {

    private final int armor;

    public Clothing(String name, int weight, int value, int armor) {
        super(name, weight, value);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public int calculateArmor(Weapon weapon) {
        return armor + weapon.getBlock()/3;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Armor : " + armor);
        System.out.println("---------------");
    }
}
