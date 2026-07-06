package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class SearchDoctor extends JFrame implements ActionListener {

    Choice choice;
    JButton searchBtn, backBtn;
    JTable table;

    SearchDoctor() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109, 164, 170));
        panel.setBounds(5, 5, 890, 590);
        add(panel);

        JLabel heading = new JLabel("Search Doctor");
        heading.setBounds(330, 20, 250, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(heading);

        JLabel lbl = new JLabel("Specialization");
        lbl.setBounds(50, 80, 120, 25);
        lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lbl);

        choice = new Choice();
        choice.setBounds(180, 80, 180, 25);
        panel.add(choice);

        try {
            conn c = new conn();
            ResultSet rs =
            c.statement.executeQuery("SELECT DISTINCT Specialization FROM doctor");
            while(rs.next()) {
                choice.add(rs.getString("Specialization"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        searchBtn = new JButton("Search");
        searchBtn.setBounds(400, 80, 120, 25);
        searchBtn.addActionListener(this);
        panel.add(searchBtn);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 140, 840, 350);
        panel.add(scrollPane);

        backBtn = new JButton("Back");
        backBtn.setBounds(360, 520, 120, 30);
        backBtn.addActionListener(this);
        panel.add(backBtn);

        setSize(900, 620);
        setLocation(300, 120);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == searchBtn) {
            try {
                conn c = new conn();
                String specialization = choice.getSelectedItem();
                String q = "select * from doctor where Specialization='" + specialization + "'";
                ResultSet rs = c.statement.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }

        else if(e.getSource() == backBtn) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new SearchDoctor();
    }
}
