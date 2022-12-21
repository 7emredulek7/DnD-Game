package Levels;
public class Level implements Displayable{

    private final int levelNumber;
    private Corridor[] corridors;
    private Level nextLevel;
    private Level preLevel;

    public Level(int levelNumber,Corridor[] corridors) {
        this.corridors = corridors;
        this.levelNumber = levelNumber;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public Corridor[] getCorridors() {
        return corridors;
    }

    public Level getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(Level nextLevel) {
        this.nextLevel = nextLevel;
    }

    public Level getPreLevel() {
        return preLevel;
    }

    public void setPreLevel(Level preLevel) {
        this.preLevel = preLevel;
    }

    @Override
    public void display() {
        System.out.println("There are " + corridors.length + " corridor in this level");
    }
}
