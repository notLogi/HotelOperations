package com.pluralsight;

public class Room {
    private int beds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(double price, int beds, boolean occupied, boolean dirty, boolean available) {
        this.price = price;
        this.beds = beds;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
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
        return available;
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

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "beds=" + beds +
                ", price=" + price +
                ", occupied=" + occupied +
                ", dirty=" + dirty +
                ", available=" + available +
                '}';
    }
}
