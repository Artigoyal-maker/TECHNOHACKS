package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateDoctor extends JFrame implements ActionListener {

    JTextField tfId, tfName, tfSpecialization,
               tfPhone, tfEmail, tfAvailability, feeField;

    JButton searchBtn, updateBtn, backBtn;

    UpdateDoctor() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109,164,170));
        panel.setBounds(5,5,600,500);
        add(panel);

        JLabel heading = new JLabel("Update Doctor");
        heading.setBounds(200,20,250,30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(heading);

        JLabel l1 = new JLabel("Doctor ID");
        l1.setBounds(50,80,120,25);
        panel.add(l1);

        tfId = new JTextField();
        tfId.setBounds(200,80,180,25);
        panel.add(tfId);

        searchBtn = new JButton("Search");
        searchBtn.setBounds(400,80,100,25);
        searchBtn.addActionListener(this);
        panel.add(searchBtn);

        JLabel l2 = new JLabel("Name");
        l2.setBounds(50,130,120,25);
        panel.add(l2);

        tfName = new JTextField();
        tfName.setBounds(200,130,180,25);
        panel.add(tfName);

        JLabel l3 = new JLabel("Specialization");
        l3.setBounds(50,180,120,25);
        panel.add(l3);

        tfSpecialization = new JTextField();
        tfSpecialization.setBounds(200,180,180,25);
        panel.add(tfSpecialization);

        JLabel l4 = new JLabel("Phone");
        l4.setBounds(50,230,120,25);
        panel.add(l4);

        tfPhone = new JTextField();
        tfPhone.setBounds(200,230,180,25);
        panel.add(tfPhone);

        JLabel l5 = new JLabel("Email");
        l5.setBounds(50,280,120,25);
        panel.add(l5);

        tfEmail = new JTextField();
        tfEmail.setBounds(200,280,180,25);
        panel.add(tfEmail);

        JLabel l6 = new JLabel("Availability");
        l6.setBounds(50,330,120,25);
        panel.add(l6);

        tfAvailability = new JTextField();
        tfAvailability.setBounds(200,330,180,25);
        panel.add(tfAvailability);

        JLabel l7 = new JLabel("Doctor Fee");
        l7.setBounds(50, 380, 120, 25);
        panel.add(l7);

        feeField = new JTextField();
        feeField.setBounds(200, 380, 180, 25);
        panel.add(feeField);

        updateBtn = new JButton("Update");
        updateBtn.setBounds(120,430,120,30);
        updateBtn.addActionListener(this);
        panel.add(updateBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(280,430,120,30);
        backBtn.addActionListener(this);
        panel.add(backBtn);

        setSize(620,520);
        setLocation(400,150);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == searchBtn) {

            try {
                conn c = new conn();
                String q = "SELECT * FROM doctor WHERE Doctor_ID='" + tfId.getText() + "'";
                ResultSet rs = c.statement.executeQuery(q);
                if(rs.next()) {
                    tfName.setText(rs.getString("Name"));
                    tfSpecialization.setText(rs.getString("Specialization"));
                    tfPhone.setText(rs.getString("Phone"));
                    tfEmail.setText(rs.getString("Email"));
                    tfAvailability.setText(rs.getString("Availability"));
                    feeField.setText(rs.getString("Doctor_Fee"));
                } else {
                    JOptionPane.showMessageDialog(null, "Doctor Not Found");
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }

        else if(e.getSource() == updateBtn) {
            if(tfPhone.getText().trim().equals("") ||
            tfEmail.getText().trim().equals("") ||
            tfAvailability.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill All Fields");
                return;
            }try {
                conn c = new conn();
                String q = "UPDATE doctor SET "
                + "Name='" + tfName.getText() + "',"
                + "Specialization='" + tfSpecialization.getText() + "',"
                + "Phone='" + tfPhone.getText() + "',"
                + "Email='" + tfEmail.getText() + "',"
                + "Availability='" + tfAvailability.getText() + "',"
                + "Doctor Fee='" +feeField.getText() + "' "
                + "WHERE Doctor_ID='" + tfId.getText() + "'";

                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Doctor Updated Successfully");
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(e.getSource() == backBtn) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateDoctor();
    }
}
