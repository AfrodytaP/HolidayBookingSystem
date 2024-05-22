package holidaybookingsystem;

import javax.swing.JFrame;

public class HolidayBookingSystem {

    //method main to run the Welcome Screen
    public static void main(String[] args) {
        
        //transfers to Welcome frame
        Welcome welcome = new Welcome();
        welcome.setVisible(true);
        welcome.setResizable(false);
        welcome.setTitle("Welcome Screen");
        welcome.pack();
        welcome.setLocationRelativeTo(null);
        welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
