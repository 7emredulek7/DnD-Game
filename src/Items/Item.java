package Items;

public abstract class Item {

    private final String name;
    private final int weight;
    private final int value;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }


    public void display() {
        System.out.println(getName() + " : " );
        System.out.println("Weight : " + getWeight());
        System.out.println("Value : " + getValue() );
    }
}
