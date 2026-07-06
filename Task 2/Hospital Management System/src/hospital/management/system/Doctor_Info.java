package hospital.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class Doctor_Info extends JFrame {

    Doctor_Info() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 1450, 650);
        panel.setBackground(new Color(109, 164, 170));
        panel.setLayout(null);
        add(panel);

        JLabel heading = new JLabel("Doctor Information");
        heading.setBounds(600, 10, 300, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        panel.add(heading);

        JTable table = new JTable();

        try {
            conn c = new conn();

            String q = "SELECT * FROM doctor";

            ResultSet resultSet = c.statement.executeQuery(q);

            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 60, 1400, 450);
        panel.add(scrollPane);

        JButton b1 = new JButton("Back");
        b1.setBounds(650, 560, 120, 35);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        panel.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(1480, 700);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Doctor_Info();
    }
}
