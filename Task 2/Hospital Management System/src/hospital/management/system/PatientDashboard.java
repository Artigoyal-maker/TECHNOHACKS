package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PatientDashboard extends JFrame implements ActionListener {

    JButton detailsBtn, roomBtn, logoutBtn;

    PatientDashboard() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109, 164, 170));
        panel.setBounds(0, 0, 800, 500);
        add(panel);

        JLabel heading = new JLabel("Patient Dashboard");
        heading.setBounds(250, 30, 300, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 28));
        panel.add(heading);

        detailsBtn = new JButton("My Details");
        detailsBtn.setBounds(280, 120, 200, 40);
        detailsBtn.addActionListener(this);
        panel.add(detailsBtn);

        roomBtn = new JButton("Room Details");
        roomBtn.setBounds(280, 190, 200, 40);
        roomBtn.addActionListener(this);
        panel.add(roomBtn);

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

        if(e.getSource() == detailsBtn) {
            JOptionPane.showMessageDialog(null,
                    "Patient Details Feature Coming Soon");
        }

        else if(e.getSource() == roomBtn) {
            new Room();
        }

        else if(e.getSource() == logoutBtn) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new PatientDashboard();
    }
}
