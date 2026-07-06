package hospital.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.table.JTableHeader;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class Room extends JFrame {

    JTable table;

    Room() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 590);
        panel.setBackground(new Color(90, 156, 163));
        panel.setLayout(null);
        add(panel);

        JLabel heading = new JLabel("Room Details");
        heading.setBounds(330, 20, 250, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        heading.setForeground(Color.WHITE);
        panel.add(heading);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/roomm.png"));
        Image image = imageIcon.getImage().getScaledInstance(220, 220, Image.SCALE_SMOOTH);
        ImageIcon imageIcon1 = new ImageIcon(image);

        JLabel imageLabel = new JLabel(imageIcon1);
        imageLabel.setBounds(630, 170, 220, 220);
        panel.add(imageLabel);

        table = new JTable();
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setFont(new Font("Tahoma", Font.PLAIN, 13));
        table.setRowHeight(25);

        table.setSelectionBackground(new Color(90, 156, 163));
        table.setSelectionForeground(Color.WHITE);

        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 14));
        header.setBackground(Color.BLACK);
        header.setForeground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 70, 570, 420);
        panel.add(scrollPane);

        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM room");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        } catch (Exception e) {
            e.printStackTrace();
        }

        JButton back = new JButton("Back");
        back.setBounds(250, 510, 120, 35);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(back);

        back.addActionListener(new ActionListener() {
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
        new Room();
    }
}
