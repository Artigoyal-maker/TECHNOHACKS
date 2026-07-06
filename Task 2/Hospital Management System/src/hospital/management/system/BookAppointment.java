package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookAppointment extends JFrame implements ActionListener {

    Choice patientChoice, doctorChoice;
    JTextField tfDate, tfTime;
    JComboBox<String> statusBox;

    JButton bookBtn, backBtn;

    BookAppointment() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109,164,170));
        panel.setBounds(5,5,600,450);
        add(panel);

        JLabel heading = new JLabel("Book Appointment");
        heading.setBounds(180,20,250,30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(heading);

        JLabel l1 = new JLabel("Patient");
        l1.setBounds(50,80,120,25);
        panel.add(l1);

        patientChoice = new Choice();
        patientChoice.setBounds(220,80,180,25);

        try {
            conn c = new conn();

            ResultSet rs =
            c.statement.executeQuery(
            "SELECT NAME FROM Patient_Info");

            while(rs.next()) {
                patientChoice.add(
                rs.getString("NAME"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        panel.add(patientChoice);

        JLabel l2 = new JLabel("Doctor");
        l2.setBounds(50,130,120,25);
        panel.add(l2);

        doctorChoice = new Choice();
        doctorChoice.setBounds(220,130,180,25);

        try {
            conn c = new conn();

            ResultSet rs =
            c.statement.executeQuery(
            "SELECT Name FROM doctor");

            while(rs.next()) {
                doctorChoice.add(
                rs.getString("Name"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        panel.add(doctorChoice);

        JLabel l3 = new JLabel("Date");
        l3.setBounds(50,180,120,25);
        panel.add(l3);

        tfDate = new JTextField();
        tfDate.setBounds(220,180,180,25);
        panel.add(tfDate);

        JLabel l4 = new JLabel("Time");
        l4.setBounds(50,230,120,25);
        panel.add(l4);

        tfTime = new JTextField();
        tfTime.setBounds(220,230,180,25);
        panel.add(tfTime);

        JLabel l5 = new JLabel("Status");
        l5.setBounds(50,280,120,25);
        panel.add(l5);

        statusBox = new JComboBox<>(
        new String[] {
        "Scheduled",
        "Completed",
        "Cancelled"
        });

        statusBox.setBounds(220,280,180,25);
        panel.add(statusBox);

        bookBtn = new JButton("Book");
        bookBtn.setBounds(120,350,120,30);
        bookBtn.addActionListener(this);
        panel.add(bookBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(280,350,120,30);
        backBtn.addActionListener(this);
        panel.add(backBtn);

        setSize(620,450);
        setLocation(400,150);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == bookBtn) {
            if(tfDate.getText().trim().equals("") ||
            tfTime.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter Date and Time");
                return;
            }try {
                conn c = new conn();
                String q = "INSERT INTO appointment(patient_name, doctor_name, appointment_date, appointment_time, status) VALUES('"
                + patientChoice.getSelectedItem() + "','"
                + doctorChoice.getSelectedItem() + "','"
                + tfDate.getText() + "','"
                + tfTime.getText() + "','"
                + statusBox.getSelectedItem() + "')";

                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Appointment Booked Successfully");
                setVisible(false);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(e.getSource() == backBtn) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BookAppointment();
    }
}
