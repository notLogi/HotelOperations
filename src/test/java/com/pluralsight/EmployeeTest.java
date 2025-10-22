package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchIn_Shouldbe_calculated(){
        Employee employee = new Employee(23235, "Roger", "Clerk", 15.30, 30.00);
        employee.punchIn(23.00);
        assertEquals(23.00, employee.getTime());
        employee.punchOut(24.00);
        assertEquals(31.00, employee.getHoursWorked());
    }

}