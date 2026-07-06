package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppointmentManagement extends JFrame implements ActionListener {

    JButton bookBtn, viewBtn, cancelBtn, backBtn;

    AppointmentManagement() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109, 164, 170));
        panel.setBounds(5, 5, 500, 400);
        add(panel);

        JLabel heading = new JLabel("Appointment Management");
        heading.setBounds(90, 30, 350, 35);
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        panel.add(heading);

        bookBtn = new JButton("Book Appointment");
        bookBtn.setBounds(150, 120, 180, 35);
        panel.add(bookBtn);

        viewBtn = new JButton("View Appointments");
        viewBtn.setBounds(150, 180, 180, 35);
        panel.add(viewBtn);

        cancelBtn = new JButton("Cancel Appointment");
        cancelBtn.setBounds(150,240,180,35);
        panel.add(cancelBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(150, 300, 180, 35);
        panel.add(backBtn);

        bookBtn.addActionListener(this);
        viewBtn.addActionListener(this);
        cancelBtn.addActionListener(this);
        backBtn.addActionListener(this);

        setSize(520, 420);
        setLocation(450, 180);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == bookBtn) {
            new BookAppointment();
        }

        else if(e.getSource() == viewBtn) {
            new AppointmentInfo();
        }

        else if(e.getSource() == cancelBtn) {
            new CancelAppointment();
        }

        else if(e.getSource() == backBtn) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AppointmentManagement();
    }
}
