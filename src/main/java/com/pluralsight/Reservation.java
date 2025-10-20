package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(boolean weekend, int numberOfNights, String roomType) {
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;
        price = roomType.equalsIgnoreCase("king") ? 139.00 : 124.00;
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal(){
        if(isWeekend()){
            price *= 1.10;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "roomType='" + roomType + '\'' +
                ", price=" + price +
                ", numberOfNights=" + numberOfNights +
                ", weekend=" + weekend +
                '}';
    }
}
