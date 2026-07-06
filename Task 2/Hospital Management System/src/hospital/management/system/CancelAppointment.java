package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CancelAppointment extends JFrame implements ActionListener {

    Choice appointmentChoice;
    JButton cancelBtn, backBtn;

    CancelAppointment() {

        setLayout(null);

        JLabel heading =
        new JLabel("Cancel Appointment");
        heading.setBounds(120,20,250,30);
        add(heading);

        appointmentChoice = new Choice();

        try {

            conn c = new conn();

            ResultSet rs =
            c.statement.executeQuery(
            "select Appointment_ID from appointment where status='Scheduled'");

            while(rs.next()) {
                appointmentChoice.add(
                rs.getString("Appointment_ID"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        appointmentChoice.setBounds(120,80,150,25);
        add(appointmentChoice);

        cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(70,150,100,30);
        cancelBtn.addActionListener(this);
        add(cancelBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(190,150,100,30);
        backBtn.addActionListener(this);
        add(backBtn);

        setSize(400,250);
        setLocation(500,250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==cancelBtn) {

            try {

                conn c = new conn();

                c.statement.executeUpdate(
                "update appointment set status='Cancelled' where Appointment_ID="
                + appointmentChoice.getSelectedItem());

                JOptionPane.showMessageDialog(
                null,
                "Appointment Cancelled");

            } catch(Exception ex) {
                ex.printStackTrace();
            }

        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new CancelAppointment();
    }
}
