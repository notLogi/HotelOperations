package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room myRoom = new Room(200, 2, true, false);
        System.out.println(myRoom.toString());
        Reservation reservation = new Reservation(true, 3, "king");
        System.out.println(reservation.toString());
        Employee employee = new Employee(12424, "Robert", "IT", 23.50, 45);
        System.out.println(employee.toString());
    }
}
