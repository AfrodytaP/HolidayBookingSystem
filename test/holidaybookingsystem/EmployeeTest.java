/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidaybookingsystem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author afrodyta
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    /**
     * Test of getFirstName method, of class Employee.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName()");
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        String expResult = "Afrodyta";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSurname method, of class Employee.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname()");
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        String expResult = "Pudlo";
        String result = instance.getSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class Employee.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge()");
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        String expResult = "25";
        String result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGender method, of class Employee.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender()");
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        String expResult = "Female";
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHolidayRemaining method, of class Employee.
     */
    @Test
    public void testGetHolidayRemaining() {
        System.out.println("getHolidayRemaining()");
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        int expResult = 30;
        int result = instance.getHolidayRemaining();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getHolidayRequest method, of class Employee.
     */
    @Test
    public void testGetHolidayRequest() {
        System.out.println("getHolidayRequest()");
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        int expResult = 4;
        int result = instance.getHolidayRequest();
        assertEquals(expResult, result); 
    }

    /**
     * Test of getHolidayStatus method, of class Employee.
     */
    @Test
    public void testGetHolidayStatus() {
        System.out.println("getHolidayStatus()");
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        String expResult = "Approved";
        String result = instance.getHolidayStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmployeeID method, of class Employee.
     */
    @Test
    public void testSetEmployeeID() {
        System.out.println("setEmployeeID()");
        int employeeID = 1;
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        instance.setEmployeeID(employeeID);
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName()");
        String firstName =  "Afrodyta";
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        instance.setFirstName(firstName);
    }

    /**
     * Test of setSurname method, of class Employee.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname()");
        String surname =  "Pudlo";
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        instance.setSurname(surname);
    }

    /**
     * Test of setAge method, of class Employee.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge()");
        String age =  "25";
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        instance.setAge(age);
    }

    /**
     * Test of setGender method, of class Employee.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender()");
        String gender =  "Female";
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        instance.setGender(gender);
    }

    /**
     * Test of setHolidayRemaining method, of class Employee.
     */
    @Test
    public void testSetHolidayRemaining() {
        System.out.println("setHolidayRemaining()");
        int holidayRemaining = 30;
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        instance.setHolidayRemaining(holidayRemaining);
    }

    /**
     * Test of setHolidayRequest method, of class Employee.
     */
    @Test
    public void testSetHolidayRequest() {
        System.out.println("setHolidayRequest()");
        int holidayRequest = 4;
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        instance.setHolidayRequest(holidayRequest);
    }

    /**
     * Test of setHolidayStatus method, of class Employee.
     */
    @Test
    public void testSetHolidayStatus() {
        System.out.println("setHolidayStatus()");
        String holidayStatus =  "Approved";
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        instance.setHolidayStatus(holidayStatus);
    }

    /**
     * Test of hashCode method, of class Employee.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode()");
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        int expResult = 260;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Employee.
     */
    @Test
    public void testEquals() {
        System.out.println("equals()");
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        boolean expResult = true;
        Object result = instance.equals(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Employee.
     */
    @Test
    public void testToString() {
        System.out.println("toString()");
        Employee instance = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        String expResult = "1,Afrodyta,Pudlo,25,Female,30,4,Approved";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of autoincromentID method, of class Employee.
     */
    @Test
    public void testAutoincromentID() {
        System.out.println("autoincromentID()");
        Employee instance1 = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        EmployeeFile instance2 = new EmployeeFile();
        int expResult = instance2.getAllEmployee().length+1;
        int result = instance1.autoincromentID(0, ",");
        assertEquals(expResult, result);
    }
    
}
