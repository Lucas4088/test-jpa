package model;

public class Cage {
    private int id;
    private int capacity;
    private boolean occupied;

    public Cage(int id, int capacity, boolean occupied) {
        this.id = id;
        this.capacity = capacity;
        this.occupied = occupied;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
