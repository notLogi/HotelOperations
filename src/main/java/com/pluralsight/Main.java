package com.pluralsight;


import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Room myRoom = new Room(200, 2, true, false);
        System.out.println(myRoom.toString());
        Reservation reservation = new Reservation(true, 3, "king");
        System.out.println(reservation.toString());
        Employee employee = new Employee(12424, "Robert", "IT", 23.50, 45);
        System.out.println(employee.toString());
        Employee employee2 = new Employee(12424, "Robert", "IT", 23.50, 8);
        System.out.println(employee2.toString());

        employee2.punchTimeCard(LocalTime.parse("01:23:23"));
        employee2.punchTimeCard(LocalTime.parse("07:43:23"));
        System.out.println("Hours worked: " + employee2.getHoursWorked());

    }
}
