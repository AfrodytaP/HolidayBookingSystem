package holidaybookingsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author afrod
 */
public class EmployeeFile implements Data {

    public EmployeeFile() {
    }

    //path file with Employee information
    private String filePath = "EmployeeData.txt";
    private File file = new File(filePath);
   
    //method to get all Employee's on file
    @Override
    public Employee[] getAllEmployee() {
        // Check if the file exists in the system
        if (file.exists()) {
            ArrayList<Employee> arrList = new ArrayList<>();
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String data = "";

                while ((data = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(data, ",");
                    Employee emp = new Employee();

                    while (st.hasMoreTokens()) {
                        emp.setEmployeeID(Integer.parseInt(st.nextToken().trim()));
                        emp.setFirstName(st.nextToken().trim());
                        emp.setSurname(st.nextToken().trim());
                        emp.setAge(st.nextToken().trim());
                        emp.setGender(st.nextToken().trim());
                        emp.setHolidayRemaining(Integer.parseInt(st.nextToken().trim()));
                        emp.setHolidayRequest(Integer.parseInt(st.nextToken().trim()));
                        emp.setHolidayStatus(st.nextToken().trim());

                        arrList.add(emp);
                    }
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Error loading File");
            }
            Employee myArray[] = new Employee[arrList.size()];
            myArray = arrList.toArray(myArray);

            return myArray;
        }
        return null;
    }

    //method to save new Employee to file 
    @Override
    public void saveEmployee(Employee ep) {
        // Check if the file exists in the system
        if (file.exists()) {
            Employee employee = ep;
            ArrayList<Employee> a1 = new ArrayList<>();

            System.out.println(employee);
            a1.addAll(Arrays.asList(getAllEmployee()));
            a1.add(ep);
            System.out.println(a1);
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                for (Employee employeeArray2 : a1) {
                    bw.write(employeeArray2.toString());
                    bw.newLine();
                }
                bw.flush();
                bw.close();
                JOptionPane.showMessageDialog(null, "Employee has been added");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "An Error has occurred");
            }
        }
    }

    //method to delete Employee by their ID
    @Override
    public void deleteEmployee(String employeeID, int idIndex, String delimiter) {
        // Check if the file exists in the system
        if (file.exists()) {
            int position = idIndex;
            String tempFile = "temp.txt";
            File oldFile = file;
            File newFile = new File(tempFile);

            String currentLine;
            String data[];
            try {
                FileWriter fw = new FileWriter(tempFile);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                while ((currentLine = br.readLine()) != null) {
                    data = currentLine.split(delimiter);
                    if (!(data[position].equalsIgnoreCase(employeeID))) {
                        pw.println(currentLine);
                    }
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                bw.close();
                fw.close();

                oldFile.delete();
                File dump = file;
                newFile.renameTo(dump);

                JOptionPane.showMessageDialog(null, "The employee with the ID of " + employeeID + " has been deleted.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "An Error has occurred");
            }
        }
    }

    //method to find Employee by their ID
    @Override
    public String findEmployeeByID(String employeeID, int idIndex, int indexOfVeriable, String delimiter) {

        String veriableRequiered = null;

        // Check if the file exists in the system
        if (file.exists()) {

            String currentLine;
            String data[];
            try {

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                while ((currentLine = br.readLine()) != null) {
                    data = currentLine.split(delimiter);
                    if ((data[idIndex].equalsIgnoreCase(employeeID))) {
                        veriableRequiered = data[indexOfVeriable];
                    }
                }
                fr.close();
                br.close();

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "An Error has occurred");
            }
        }
        return veriableRequiered;
    }

    //method to request holiday
    @Override
    public long requestingHoliday(Date holidayStart, Date holidayEnd) {

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        long numberOfHolidays = 0;
        try {
            holidayStart = sdf.parse(format.format(holidayStart));
            holidayEnd = sdf.parse(format.format(holidayEnd));

            long diff = holidayEnd.getTime() - holidayStart.getTime();

            numberOfHolidays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + 1;

        } catch (ParseException ex) {
            Logger.getLogger(RequestHoliday.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numberOfHolidays;
    }

    //method to edit Employee by ID
    @Override
    public void editEmployeeByID(String employeeID, int idIndex,  Employee employee, String delimiter) {

        // Check if the file exists in the system
        if (file.exists()) {
            int position = idIndex;
            String tempFile = "temp.txt";
            File oldFile = file;
            File newFile = new File(tempFile);

            String currentLine;
            String data[];
            try {
                FileWriter fw = new FileWriter(tempFile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                while ((currentLine = br.readLine()) != null) {
                    data = currentLine.split(delimiter);
                    if (!(data[position].equalsIgnoreCase(employeeID))) {
                        pw.println(currentLine);
                    }else{
                        pw.println(employee);
                    }
                        
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                bw.close();
                fw.close();

                oldFile.delete();
                File dump = file;
                newFile.renameTo(dump);

                JOptionPane.showMessageDialog(null, "Thank you for submitting the holiday request. Please check the Holiday Status tab to see the results for the request.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "An Error has occurred");
            }
        }
    }
    
    //method to validate the ID entered
    @Override
    public boolean validationID(String employeeID) {

        //boolean returns true if all validation have passed.
        boolean isValis = true;

        //checks that no fields are left empty.
        if (employeeID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please make sure to fill in the field.");
            isValis = false;
        }

        //checks remaining holidays only numbers are entered.
        if (!employeeID.matches("[0-9]*$")) {
            JOptionPane.showMessageDialog(null, "The employees ID entered is not valid. Please only enter numbers from 0 to 9.");
            isValis = false;
        }

        //returns the result.
        return isValis;
    }
}
