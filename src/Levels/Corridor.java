package Levels;


public class Corridor implements Displayable{
    private final int corridorNumber;
    private Room[] rooms;
    private Corridor nextCorridor;
    private Corridor preCorridor;

    public Corridor(int corridorNumber,Room[] rooms) {
        this.corridorNumber = corridorNumber;
        this.rooms = rooms;
    }

    public int getCorridorNumber() {
        return corridorNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public Corridor getNextCorridor() {
        return nextCorridor;
    }

    public void setNextCorridor(Corridor nextCorridor) {
        this.nextCorridor = nextCorridor;
    }

    public Corridor getPreCorridor() {
        return preCorridor;
    }

    public void setPreCorridor(Corridor preCorridor) {
        this.preCorridor = preCorridor;
    }

    @Override
    public void display() {
        System.out.println("There are " + rooms.length + " rooms in this corridor");
    }
}
