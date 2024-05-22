package holidaybookingsystem;

import java.util.Date;


public interface Data <T>{
    
    T getAllEmployee();
    void saveEmployee(Employee ep);
    void deleteEmployee(String employeeID, int idIndex, String delimiter);
    String findEmployeeByID(String employeeID, int idIndex, int indexOfVeriable, String delimiter);
    long requestingHoliday(Date holidayStart, Date holidayEnd);
    void editEmployeeByID(String employeeID, int idIndex,  Employee employee, String delimiter);
    boolean validationID(String employeeID);
}
