package Characters;

public abstract class Character {
    private String name;
    private int HP;

    public Character() {
        this.name = "Character";
        this.HP = 0;
    }

    public Character(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

}
