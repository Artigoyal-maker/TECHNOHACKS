package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Doctor extends JFrame implements ActionListener {

    JTextField tfName, tfSpecialization, tfPhone, tfEmail, tfAvailability, feeField;
    JButton addBtn, backBtn;

    Doctor () {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 640, 490);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        JLabel heading = new JLabel("Doctor Registration");
        heading.setBounds(180,20,250,30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(heading);

        JLabel l1 = new JLabel("Doctor Name");
        l1.setBounds(50,80,120,25);
        panel.add(l1);

        tfName = new JTextField();
        tfName.setBounds(200,80,200,25);
        panel.add(tfName);

        JLabel l2 = new JLabel("Specialization");
        l2.setBounds(50,130,120,25);
        panel.add(l2);

        tfSpecialization = new JTextField();
        tfSpecialization.setBounds(200,130,200,25);
        panel.add(tfSpecialization);

        JLabel l3 = new JLabel("Phone");
        l3.setBounds(50,180,120,25);
        panel.add(l3);

        tfPhone = new JTextField();
        tfPhone.setBounds(200,180,200,25);
        panel.add(tfPhone);

        JLabel l4 = new JLabel("Email");
        l4.setBounds(50, 230, 120, 25);
        panel.add(l4);

        tfEmail = new JTextField();
        tfEmail.setBounds(200, 230, 200, 25);
        panel.add(tfEmail);

        JLabel l5 = new JLabel("Availability");
        l5.setBounds(50, 280, 120, 25);
        panel.add(l5);

        tfAvailability = new JTextField();
        tfAvailability.setBounds(200, 280, 200, 25);
        panel.add(tfAvailability);

        JLabel l6 = new JLabel("Doctor Fee");
        l6.setBounds(50, 330, 200, 25);
        panel.add(l6);

        feeField = new JTextField();
        feeField.setBounds(200, 330, 200, 25);
        panel.add(feeField);

        addBtn = new JButton("ADD");
        addBtn.setBounds(120,400,120,30);
        addBtn.addActionListener(this);
        panel.add(addBtn);

        backBtn = new JButton("BACK");
        backBtn.setBounds(280,400,120,30);
        backBtn.addActionListener(this);
        panel.add(backBtn);

        setSize(650,500);
        setLayout(null);
        setLocation(350,150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == addBtn) {
            // VALIDATION HERE
            if(tfName.getText().trim().equals("") || 
            tfSpecialization.getText().trim().equals("") ||
            tfPhone.getText().trim().equals("") ||
            tfEmail.getText().trim().equals("") ||
            tfAvailability.getText().trim().equals("") ||
            feeField.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill All Fields");
                
                return;
            }
            try {
                conn c = new conn();
                String q = "insert into doctor(Name, Specialization, Phone, email, Availability, Doctor_Fee) values('"
                + tfName.getText() + "','"
                + tfSpecialization.getText() + "','"
                + tfPhone.getText() + "','"
                + tfEmail.getText() + "','"
                + tfAvailability.getText() + "','"
                + feeField.getText() + "')'";

                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Doctor Added Successfully");
                setVisible(false);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Doctor();
    }
    
}