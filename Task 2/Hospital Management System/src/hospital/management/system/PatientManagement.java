package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PatientManagement extends JFrame implements ActionListener {

    JButton addBtn, viewBtn, updateBtn, dischargeBtn, backBtn;

    PatientManagement() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109, 164, 170));
        panel.setBounds(5, 5, 500, 500);
        add(panel);

        JLabel heading = new JLabel("Patient Management");
        heading.setBounds(120, 30, 300, 35);
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        panel.add(heading);

        addBtn = new JButton("Add Patient");
        addBtn.setBounds(150, 100, 180, 35);
        panel.add(addBtn);

        viewBtn = new JButton("View Patients");
        viewBtn.setBounds(150, 160, 180, 35);
        panel.add(viewBtn);

        updateBtn = new JButton("Update Patient");
        updateBtn.setBounds(150, 220, 180, 35);
        panel.add(updateBtn);

        dischargeBtn = new JButton("Discharge Patient");
        dischargeBtn.setBounds(150, 280, 180, 35);
        panel.add(dischargeBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(150, 340, 180, 35);
        panel.add(backBtn);

        addBtn.addActionListener(this);
        viewBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        dischargeBtn.addActionListener(this);
        backBtn.addActionListener(this);

        setSize(520, 480);
        setLocation(450, 180);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == addBtn) {
            new New_Patient();
        }

        else if(e.getSource() == viewBtn) {
            new ALL_Patient_info();
        }

        else if(e.getSource() == updateBtn) {
            new Update_Patient_Details();
        }

        else if(e.getSource() == dischargeBtn) {
            new Patient_discharge();
        }

        else if(e.getSource() == backBtn) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new PatientManagement();
    }
}
