package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double time;

    Employee(int employeeId, String name, String department, double payRate, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTime(){
        return time;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
    public String getDepartment(){
        return department;
    }

    public double getPayRate(){
        return payRate;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return getPayRate() * getRegularHours() + getOvertimeHours() * getPayRate() * 1.5;
    }

    public double getRegularHours(){
        if(hoursWorked >= 40){
            return 40;
        }
        else if(hoursWorked > 0){
            return hoursWorked;
        }
        return 0;
    }

    public double getOvertimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }
        return 0;
    }

    public void punchIn(double time) {
        this.time = time;
    }

    public void punchOut(double time) {
        double duration = time - this.time;
        hoursWorked += duration;
        this.time = 0;
    }


    public void punchTimeCard(double time) {
        if (time == 0) {
            this.time = time;
        } else {
            double duration = this.time - time;
            hoursWorked += duration;
            this.time = 0;
        }
    }


    public void punchIn(){
        LocalTime startTime = LocalTime.now();
        int hour = startTime.getHour();
        int minute = startTime.getMinute();
        time = hour + (minute / 60.0);
        System.out.println("punched in at: " + time);
    }

    public void punchOut() {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        double time2 = hour + (minute / 60.0);
        double duration = time2 - time;
        hoursWorked += duration;
        time = 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked= " + hoursWorked +
                " Overtime hours: " + getOvertimeHours() + " Regular hours: " + getRegularHours() + " Total pay: " + getTotalPay() + '}';
    }
}
