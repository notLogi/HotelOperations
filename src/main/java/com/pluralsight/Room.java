package com.pluralsight;

public class Room {
    private int beds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(double price, int beds, boolean occupied, boolean dirty) {
        this.price = price;
        this.beds = beds;
        this.occupied = false;
        this.dirty = false;
    }

    public int getBeds() {
        return beds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !isDirty() && !isOccupied();
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    @Override
    public String toString() {
        return "Room{" +
                "beds=" + beds +
                ", price=" + price +
                ", occupied=" + occupied +
                ", dirty=" + dirty +
                '}';
    }
}
