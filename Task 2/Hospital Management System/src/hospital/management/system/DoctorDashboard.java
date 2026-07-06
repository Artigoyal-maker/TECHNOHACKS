package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DoctorDashboard extends JFrame implements ActionListener {

    JButton profileBtn, patientBtn, logoutBtn;

    DoctorDashboard() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109, 164, 170));
        panel.setBounds(0, 0, 800, 500);
        add(panel);

        JLabel heading = new JLabel("Doctor Dashboard");
        heading.setBounds(260, 30, 300, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 28));
        panel.add(heading);

        profileBtn = new JButton("My Profile");
        profileBtn.setBounds(280, 120, 200, 40);
        profileBtn.addActionListener(this);
        panel.add(profileBtn);

        patientBtn = new JButton("Patient List");
        patientBtn.setBounds(280, 190, 200, 40);
        patientBtn.addActionListener(this);
        panel.add(patientBtn);

        logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(280, 260, 200, 40);
        logoutBtn.addActionListener(this);
        panel.add(logoutBtn);

        setSize(800, 500);
        setLocation(350, 150);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == profileBtn) {
            JOptionPane.showMessageDialog(null,
                    "Doctor Profile Feature Coming Soon");
        }

        else if(e.getSource() == patientBtn) {
            new ALL_Patient_info();
        }

        else if(e.getSource() == logoutBtn) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new DoctorDashboard();
    }
}
