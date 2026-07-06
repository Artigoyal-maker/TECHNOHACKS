package hospital.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import javax.swing.table.JTableHeader;

public class SearchRoom extends JFrame {

    Choice choice;
    JTable table;

    SearchRoom() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 690, 490);
        panel.setBackground(new Color(90, 156, 163));
        panel.setLayout(null);
        add(panel);

        JLabel search = new JLabel("Search For Room");
        search.setBounds(240, 15, 220, 30);
        search.setForeground(Color.WHITE);
        search.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(search);

        JLabel status = new JLabel("Room Status");
        status.setBounds(70, 70, 100, 25);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(status);

        choice = new Choice();
        choice.add("Available");
        choice.add("Occupied");
        choice.setBounds(180, 70, 140, 25);
        panel.add(choice);

        JButton searchBtn = new JButton("Search");
        searchBtn.setBounds(370, 68, 100, 28);
        searchBtn.setBackground(Color.WHITE);
        searchBtn.setForeground(Color.BLACK);
        panel.add(searchBtn);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(500, 68, 100, 28);
        backBtn.setBackground(Color.WHITE);
        backBtn.setForeground(Color.BLACK);
        panel.add(backBtn);

        table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 13));
        table.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 120, 670, 320);
        panel.add(scrollPane);

        loadTable("SELECT * FROM room");

        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "SELECT * FROM room WHERE Availability='"
                        + choice.getSelectedItem() + "'";
                loadTable(q);
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(700, 500);
        setLayout(null);
        setLocation(450, 200);
        setVisible(true);
    }

    public void loadTable(String query) {
        try {
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));

            JTableHeader header = table.getTableHeader();
            header.setFont(new Font("Tahoma", Font.BOLD, 14));
            header.setBackground(Color.BLACK);
            header.setForeground(Color.WHITE);

            table.setSelectionBackground(new Color(70, 130, 180));
            table.setGridColor(Color.LIGHT_GRAY);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SearchRoom();

    }

}
