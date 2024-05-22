package holidaybookingsystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeFileTest {

    public EmployeeFileTest() {
    }
    private String filePath = "EmployeeData.txt";

    /**
     * Test of getAllEmployee method, of class EmployeeFile.
     */
    @Test
    public void testGetAllEmployee() {

        System.out.println("getAllEmployee()");
        EmployeeFile instance = new EmployeeFile();
        int expResult = countLine(filePath);
        int result = instance.getAllEmployee().length;
        assertEquals(expResult, result);
    }

    /**
     * Test of saveEmployee method, of class EmployeeFile.
     */
    @Test
    public void testSaveEmployeeAssertEquals() {
        System.out.println("saveEmployee()");
        Employee ep = new Employee();
        int employeeID = ep.autoincromentID(0, ",");
        EmployeeFile instanceFile = new EmployeeFile();

        int sizeOfFile = instanceFile.getAllEmployee().length;
        System.out.println(sizeOfFile);

        int expResult = sizeOfFile + 1;

        Employee ep1 = new Employee(employeeID, "Test", "Test", "25", "Female", 30, 4, "Approved");

        instanceFile.saveEmployee(ep1);

        int result = instanceFile.getAllEmployee().length;
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);

        instanceFile.deleteEmployee(String.valueOf(employeeID), 0, ",");

    }

    /**
     * Test of deleteEmployee method, of class EmployeeFile.
     */
    @Test
    public void testDeleteEmployee() {
        System.out.println("deleteEmployee()");
        EmployeeFile instanceFile = new EmployeeFile();
        Employee ep = new Employee();
        int employeeID = ep.autoincromentID(0, ",");
        Employee ep1 = new Employee(employeeID, "Test", "Test", "25", "Male", 47, 0, "Not Requested");

        instanceFile.saveEmployee(ep1);
        int sizeOfFile = instanceFile.getAllEmployee().length;

        int expResult = sizeOfFile - 1;

        instanceFile.deleteEmployee(String.valueOf(employeeID), 0, ",");

        int result = instanceFile.getAllEmployee().length;
        assertEquals(expResult, result);
    }

    /**
     * Test of findEmployeeByID method, of class EmployeeFile.
     */
    @Test
    public void testFindEmployeeByIDAssertEquals() {
        System.out.println("findEmployeeByID()");
        EmployeeFile instance = new EmployeeFile();
        String expResult = "Tom";
        String result = instance.findEmployeeByID("3", 0, 1, ",");
        assertEquals(expResult, result);
    }

    /**
     * Test of requestingHoliday method, of class EmployeeFile.
     */
    @Test
    public void testRequestingHolidayAssertEquals() throws ParseException {
        System.out.println("requestingHoliday()");
        EmployeeFile instance = new EmployeeFile();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        String dateInString1 = "1-Dec-2021";
        Date date1 = formatter.parse(dateInString1);

        String dateInString2 = "3-Dec-2021";
        Date date2 = formatter.parse(dateInString2);

        long expResult = 3L;
        long result = instance.requestingHoliday(date1, date2);
        assertEquals(expResult, result);
    }

    /**
     * Test of editEmployeeByID method, of class EmployeeFile.
     */
    @Test
    public void testEditEmployeeByIDAssertEquals() {
        System.out.println("editEmployeeByID()");
        Employee instanceEmp = new Employee(1, "Afrodyta", "Pudlo", "25", "Female", 30, 4, "Approved");
        EmployeeFile instanceFile = new EmployeeFile();

        String expResult = instanceFile.findEmployeeByID("1", 0, 1, ",");

        instanceFile.editEmployeeByID("1", 0, instanceEmp, ",");

        String result = instanceFile.findEmployeeByID("1", 0, 1, ",");
        assertNotEquals(expResult, result);
        instanceEmp = new Employee(1, "Ben", "Johnson", "25", "Male", 40, 0, "Not Requested");
        instanceFile.editEmployeeByID("1", 0, instanceEmp, ",");
    }

    /**
     * Test of validationID method, of class EmployeeFile.
     */
    @Test
    public void testValidationID() {
        System.out.println("validationID()");
        EmployeeFile instance = new EmployeeFile();
        boolean expResult = true;
        boolean result = instance.validationID("5");
        assertEquals(expResult, result);
    }

    /**
     * countLine method, counts the number of lines in external file 
     * number of line equals number of saved employees
     */
    public int countLine(String filePath) {

        Path path = Paths.get(filePath);

        long lines = 0;
        try {

            lines = Files.lines(path).count();

        } catch (IOException e) {
            e.printStackTrace();
        }
        int num = (int) lines;
        return num;

    }
}
