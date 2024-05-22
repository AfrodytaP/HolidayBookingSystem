
package holidaybookingsystem;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author afrod
 */
public class Welcome extends javax.swing.JFrame {

       EmployeeFile epf = new EmployeeFile();
       
    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
        showEmployees();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DeleteEmployees = new javax.swing.JButton();
        TextID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NewEmployee = new javax.swing.JButton();
        RequestHoliday = new javax.swing.JButton();
        HolidayStatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 181, 217));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        DeleteEmployees.setText("Delete");
        DeleteEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmployeesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter the ID of the employee you want to delete: ");

        NewEmployee.setText("Add a new Employee");
        NewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewEmployeeActionPerformed(evt);
            }
        });

        RequestHoliday.setText("Request Holiday");
        RequestHoliday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestHolidayActionPerformed(evt);
            }
        });

        HolidayStatus.setText("Holiday Status");
        HolidayStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HolidayStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(DeleteEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(RequestHoliday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NewEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HolidayStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(NewEmployee)
                        .addGap(47, 47, 47)
                        .addComponent(RequestHoliday)
                        .addGap(45, 45, 45)
                        .addComponent(HolidayStatus)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteEmployees)
                            .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(94, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method button to delete employee from file using ID
    private void DeleteEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEmployeesActionPerformed
        // TODO add your handling code here:
        //call to validation method.
        String employeeID = TextID.getText();
        
        boolean isValid = epf.validationID(employeeID);
                
        if(isValid == false){
            
        }else{
            // Clear the text fields
            epf.deleteEmployee(employeeID, 0, ",");
            
            TextID.setText("");
            showEmployees();
        } 
    }//GEN-LAST:event_DeleteEmployeesActionPerformed

    //method button to open new employee screen
    private void NewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewEmployeeActionPerformed
        // TODO add your handling code here:
        NewEmployee newEmployee = new NewEmployee();
        newEmployee.setVisible(true);
        newEmployee.setResizable(false);
        newEmployee.setTitle("New Employee Screen");
        newEmployee.pack();
        newEmployee.setLocationRelativeTo(null);
        newEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_NewEmployeeActionPerformed

    //method button to open request holiday screen
    private void RequestHolidayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestHolidayActionPerformed
        // TODO add your handling code here:
        RequestHoliday requestHoliday = new RequestHoliday();
        requestHoliday.setVisible(true);
        requestHoliday.setResizable(false);
        requestHoliday.setTitle("Request Holiday Screen");
        requestHoliday.pack();
        requestHoliday.setLocationRelativeTo(null);
        requestHoliday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_RequestHolidayActionPerformed

    //method button to open holiday status screen
    private void HolidayStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HolidayStatusActionPerformed
        // TODO add your handling code here:
        HolidayStatus holidayStatus = new HolidayStatus();
        holidayStatus.setVisible(true);
        holidayStatus.setResizable(false);
        holidayStatus.setTitle("Holiday Status Screen");
        holidayStatus.pack();
        holidayStatus.setLocationRelativeTo(null);
        holidayStatus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_HolidayStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteEmployees;
    private javax.swing.JButton HolidayStatus;
    private javax.swing.JButton NewEmployee;
    private javax.swing.JButton RequestHoliday;
    private javax.swing.JTextField TextID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    //method to show employees from file in table
    private void showEmployees(){

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Age", "Gender"
            }
        ));
        
        jScrollPane1.setViewportView(jTable1);
        
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        Employee[] employeeArray = epf.getAllEmployee();
        
        // Loop to add the content of the file into the row
        for (Employee employeeArray1 : employeeArray) {
            
            // Create String array
            String row[] = employeeArray1.toString().split(",");
            tblModel.addRow(row);
        }

    }
}

