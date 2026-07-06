package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DoctorManagement extends JFrame implements ActionListener {
    JButton addBtn, viewBtn, updateBtn, searchBtn, backBtn;

    DoctorManagement() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109, 164, 170));
        panel.setBounds(5, 5, 500, 450);
        add(panel);

        JLabel heading = new JLabel("Doctor Management");
        heading.setBounds(120, 30, 300, 35);
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        panel.add(heading);

        addBtn = new JButton("Add Doctor");
        addBtn.setBounds(150, 100, 180, 35);
        panel.add(addBtn);

        viewBtn = new JButton("View Doctors");
        viewBtn.setBounds(150, 150, 180, 35);
        panel.add(viewBtn);

        updateBtn = new JButton("Update Doctor");
        updateBtn.setBounds(150, 200, 180, 35);
        panel.add(updateBtn);

        searchBtn = new JButton("Search Doctor");
        searchBtn.setBounds(150, 250, 180, 35);
        panel.add(searchBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(150, 300, 180, 35);
        panel.add(backBtn);

        addBtn.addActionListener(this);
        viewBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        searchBtn.addActionListener(this);
        backBtn.addActionListener(this);

        setSize(520, 450);
        setLocation(450, 180);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == addBtn) {
            new Doctor();
        }

        else if(e.getSource() == viewBtn) {
            new Doctor_Info();
        }

        else if(e.getSource() == updateBtn) {
            new UpdateDoctor();
        }

        else if(e.getSource() == searchBtn) {
            new SearchDoctor();
        }

        else if(e.getSource() == backBtn) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new DoctorManagement();
    }
}
