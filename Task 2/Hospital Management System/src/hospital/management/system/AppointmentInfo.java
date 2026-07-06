package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class AppointmentInfo extends JFrame {

    AppointmentInfo() {

        JPanel panel = new JPanel();
        panel.setBounds(5,5,900,500);
        panel.setLayout(null);
        panel.setBackground(new Color(109,164,170));
        add(panel);

        JLabel heading = new JLabel("Appointment Information");
        heading.setBounds(320,10,300,25);
        heading.setFont(new Font("Tahoma", Font.BOLD, 18));
        panel.add(heading);

        JTable table = new JTable();

        try {

            conn c = new conn();

            ResultSet rs =
            c.statement.executeQuery(
            "SELECT * FROM appointment");

            table.setModel(
            DbUtils.resultSetToTableModel(rs));

        } catch(Exception e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane =
        new JScrollPane(table);

        scrollPane.setBounds(20,50,850,350);
        panel.add(scrollPane);

        JButton back =
        new JButton("Back");

        back.setBounds(380,420,120,30);

        back.addActionListener(e ->
        setVisible(false));

        panel.add(back);

        setSize(920,520);
        setLocation(250,150);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AppointmentInfo();
    }
}
