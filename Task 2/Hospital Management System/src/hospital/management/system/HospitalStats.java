package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class HospitalStats extends JFrame {

    JLabel totalDoctors;
    JLabel totalPatients;
    JLabel totalEmployees;
    JLabel availableRooms;
    JLabel occupiedRooms;
    JLabel availableDoctors;
    JLabel busyDoctors;
    JLabel leaveDoctors;

    HospitalStats() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109, 164, 170));
        panel.setBounds(5, 5, 790, 490);
        add(panel);

        JLabel heading = new JLabel("Hospital Statistics");
        heading.setBounds(250, 20, 300, 35);
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        panel.add(heading);

        totalDoctors = new JLabel();
        totalDoctors.setBounds(80, 90, 300, 30);
        totalDoctors.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(totalDoctors);

        totalPatients = new JLabel();
        totalPatients.setBounds(80, 130, 300, 30);
        totalPatients.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(totalPatients);

        totalEmployees = new JLabel();
        totalEmployees.setBounds(80, 170, 300, 30);
        totalEmployees.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(totalEmployees);

        availableRooms = new JLabel();
        availableRooms.setBounds(80, 210, 300, 30);
        availableRooms.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(availableRooms);

        occupiedRooms = new JLabel();
        occupiedRooms.setBounds(80, 250, 300, 30);
        occupiedRooms.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(occupiedRooms);

        availableDoctors = new JLabel();
        availableDoctors.setBounds(450, 90, 300, 30);
        availableDoctors.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(availableDoctors);

        busyDoctors = new JLabel();
        busyDoctors.setBounds(450, 130, 300, 30);
        busyDoctors.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(busyDoctors);

        leaveDoctors = new JLabel();
        leaveDoctors.setBounds(450, 170, 300, 30);
        leaveDoctors.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(leaveDoctors);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(320, 350, 120, 35);
        backBtn.setBackground(Color.BLACK);
        backBtn.setForeground(Color.WHITE);
        panel.add(backBtn);

        backBtn.addActionListener(e -> setVisible(false));

        loadStatistics();

        setSize(800, 500);
        setLocation(350, 150);
        setLayout(null);
        setVisible(true);
    }

    private void loadStatistics() {

        try {

            conn c = new conn();

            ResultSet rs1 =
                    c.statement.executeQuery(
                            "SELECT COUNT(*) AS total FROM doctor");

            if(rs1.next()) {
                totalDoctors.setText(
                        "Total Doctors : " +
                                rs1.getInt("total"));
            }

            ResultSet rs2 =
                    c.statement.executeQuery(
                            "SELECT COUNT(*) AS total FROM patient_info");

            if(rs2.next()) {
                totalPatients.setText(
                        "Total Patients : " +
                                rs2.getInt("total"));
            }

            ResultSet rs3 =
                    c.statement.executeQuery(
                            "SELECT COUNT(*) AS total FROM emp_info");

            if(rs3.next()) {
                totalEmployees.setText(
                        "Total Employees : " +
                                rs3.getInt("total"));
            }

            ResultSet rs4 =
                    c.statement.executeQuery(
                            "SELECT COUNT(*) AS total FROM room WHERE Availability='Available'");

            if(rs4.next()) {
                availableRooms.setText(
                        "Available Rooms : " +
                                rs4.getInt("total"));
            }

            ResultSet rs5 =
                    c.statement.executeQuery(
                            "SELECT COUNT(*) AS total FROM room WHERE Availability='Occupied'");

            if(rs5.next()) {
                occupiedRooms.setText(
                        "Occupied Rooms : " +
                                rs5.getInt("total"));
            }

            ResultSet rs6 =
                    c.statement.executeQuery(
                            "SELECT COUNT(*) AS total FROM doctor WHERE Availability='Available'");

            if(rs6.next()) {
                availableDoctors.setText(
                        "Available Doctors : " +
                                rs6.getInt("total"));
            }

            ResultSet rs7 =
                    c.statement.executeQuery(
                            "SELECT COUNT(*) AS total FROM doctor WHERE Availability='Busy'");

            if(rs7.next()) {
                busyDoctors.setText(
                        "Busy Doctors : " +
                                rs7.getInt("total"));
            }

            ResultSet rs8 =
                    c.statement.executeQuery(
                            "SELECT COUNT(*) AS total FROM doctor WHERE Availability='On Leave'");

            if(rs8.next()) {
                leaveDoctors.setText(
                        "Doctors On Leave : " +
                                rs8.getInt("total"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new HospitalStats();
    }
}
