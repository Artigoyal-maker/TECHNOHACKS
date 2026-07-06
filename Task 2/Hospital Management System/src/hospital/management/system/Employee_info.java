package hospital.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class Employee_info extends JFrame {

    JTable table;

    Employee_info() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 1350, 590);
        panel.setBackground(new Color(109, 164, 170));
        panel.setLayout(null);
        add(panel);

        // Column Labels
        JLabel label0 = new JLabel("Emp ID");
        label0.setBounds(13, 9, 70, 20);
        label0.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label0);

        JLabel label1 = new JLabel("Name");
        label1.setBounds(150, 9, 70, 20);
        label1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label1);

        JLabel label2 = new JLabel("Age");
        label2.setBounds(270, 9, 70, 20);
        label2.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label2);

        JLabel label3 = new JLabel("Phone Number");
        label3.setBounds(380, 9, 120, 20);
        label3.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label3);

        JLabel label4 = new JLabel("Salary");
        label4.setBounds(520, 9, 70, 20);
        label4.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label4);

        JLabel label5 = new JLabel("Gmail");
        label5.setBounds(620, 9, 70, 20);
        label5.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label5);

        JLabel label6 = new JLabel("Aadhar Number");
        label6.setBounds(760, 9, 130, 20);
        label6.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label6);

        JLabel label7 = new JLabel("Department");
        label7.setBounds(930, 9, 100, 20);
        label7.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label7);

        JLabel label8 = new JLabel("Joining Date");
        label8.setBounds(1080, 9, 100, 20);
        label8.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label8);

        JLabel label9 = new JLabel("Status");
        label9.setBounds(1210, 9, 80, 20);
        label9.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label9);

        // JTable
        table = new JTable();
        table.setBackground(new Color(109, 164, 170));
        table.setForeground(Color.WHITE);
        table.setFont(new Font("Tahoma", Font.PLAIN, 13));
        table.setRowHeight(25);

        table.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        table.getTableHeader().setBackground(Color.BLACK);
        table.getTableHeader().setForeground(Color.WHITE);

        // ScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 40, 1320, 440);
        panel.add(scrollPane);

        try {
            conn c = new conn();
            String q = "SELECT * FROM emp_info";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JButton b1 = new JButton("Back");
        b1.setBounds(610, 510, 120, 30);
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
        setSize(1380, 600);
        setLayout(null);
        setLocation(10, 80);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Employee_info();
    }
}
