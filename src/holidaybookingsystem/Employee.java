package holidaybookingsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Employee extends EmployeeInfo {

    private int employeeID;
    private String firstName;
    private String surname;
    private String age;
    private String gender;
    private int holidayRemaining;
    private int holidayRequest;
    private String holidayStatus;

    public Employee() {
    }

    public Employee(int employeeID, String firstName, String surname, String age, String gender, int holidayRemaining, int holidayRequest, String holidayStatus) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.holidayRemaining = holidayRemaining;
        this.holidayRequest = holidayRequest; 
        this.holidayStatus = holidayStatus; 
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getHolidayRemaining() {
        return holidayRemaining;
    }
    
    public int getHolidayRequest() {
        return holidayRequest;
    }
    
    public String getHolidayStatus() {
        return holidayStatus;
    }

    //setters
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHolidayRemaining(int holidayRemaining) {
        this.holidayRemaining = holidayRemaining;
    }

    public void setHolidayRequest(int holidayRequest) {
        this.holidayRequest = holidayRequest;
    }
    
    public void setHolidayStatus(String holidayStatus) {
        this.holidayStatus = holidayStatus;
    }

    //hasCode
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.employeeID;
        return hash;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.employeeID != other.employeeID) {
            return false;
        }
        return true;
    }

    //toString
    @Override
    public String toString() {
        return employeeID + "," + firstName + "," + surname + "," + age + "," + gender + "," + holidayRemaining + "," + holidayRequest + "," + holidayStatus;
    }

    //method to auto increment ID of a new Employee
    @Override
    public int autoincromentID(int idIndex, String delimiter) {
        String filePath = "EmployeeData.txt";
        File file = new File(filePath);
        int employeeID = 0;
        // Check if the file exists in the system
        if (file.exists()) {
            int position = idIndex;

            String currentLine;
            String data[];
            try {

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                while ((currentLine = br.readLine()) != null) {
                    data = currentLine.split(delimiter);
                    employeeID = Integer.parseInt(data[position]);

                }
                fr.close();
                br.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "An Error has occurred");
            }
        }
        return employeeID + 1;
    }
}
