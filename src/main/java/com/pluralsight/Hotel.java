package com.pluralsight;

public class Hotel {
    private int numberOfSuites;
    private int numberOfRooms;
    private String name;
    private int bookedSuites;
    private int bookedBasicRooms;

    Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public void setNumberOfSuites(int numberOfSuites) {
        this.numberOfSuites = numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(numberOfRooms <= 0){
            return false;
        }

        if(numberOfRooms <= getAvailableRooms() && !isSuite){
            bookedBasicRooms += numberOfRooms;
            return true;
        }
        else if(numberOfRooms <= getAvailableSuites()){
            bookedSuites += numberOfRooms;
            return true;
        }
        return false;
    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }
}
