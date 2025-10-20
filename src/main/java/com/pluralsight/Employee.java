package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    Employee(int employeeId, String name, String department, double payRate, int hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
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

    public int getHoursWorked(){
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
        return ((int) getPayRate()) * hoursWorked;
    }

    public int getRegularHours(){
        if(hoursWorked >= 40){
            return 40;
        }
        else if(hoursWorked > 0){
            return hoursWorked;
        }
        return 0;
    }

    public int getOvertimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }
        return 0;
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
