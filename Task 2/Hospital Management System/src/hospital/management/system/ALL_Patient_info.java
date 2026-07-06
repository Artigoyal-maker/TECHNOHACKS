package hospital.management.system;

import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ALL_Patient_info extends JFrame {

    JTable table;

    ALL_Patient_info() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 590);
        panel.setBackground(new Color(90, 156, 163));
        panel.setLayout(null);
        add(panel);

        // Column Labels
        JLabel label1 = new JLabel("ID");
        label1.setBounds(20, 15, 80, 20);
        label1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label1);

        JLabel label2 = new JLabel("Number");
        label2.setBounds(120, 15, 100, 20);
        label2.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label2);

        JLabel label3 = new JLabel("Name");
        label3.setBounds(250, 15, 100, 20);
        label3.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label3);

        JLabel label4 = new JLabel("Gender");
        label4.setBounds(360, 15, 100, 20);
        label4.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label4);

        JLabel label5 = new JLabel("Disease");
        label5.setBounds(470, 15, 100, 20);
        label5.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label5);

        JLabel label6 = new JLabel("Room");
        label6.setBounds(590, 15, 80, 20);
        label6.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label6);

        JLabel label7 = new JLabel("Time");
        label7.setBounds(680, 15, 100, 20);
        label7.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label7);

        JLabel label8 = new JLabel("Deposit");
        label8.setBounds(800, 15, 100, 20);
        label8.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label8);

        // JTable
        table = new JTable();
        table.setBackground(new Color(90, 156, 163));
        table.setForeground(Color.WHITE);
        table.setFont(new Font("Tahoma", Font.PLAIN, 13));
        table.setRowHeight(25);

        table.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        table.getTableHeader().setBackground(Color.BLACK);
        table.getTableHeader().setForeground(Color.WHITE);

        // ScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 50, 870, 430);
        panel.add(scrollPane);

        try {
            conn c = new conn();
            String q = "SELECT * FROM patient_info";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JButton button = new JButton("Back");
        button.setBounds(380, 510, 120, 30);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(900, 600);
        setLayout(null);
        setLocation(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ALL_Patient_info();
    }
}
