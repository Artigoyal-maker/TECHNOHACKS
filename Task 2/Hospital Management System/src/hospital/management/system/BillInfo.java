package hospital.management.system;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class BillInfo extends JFrame {

    BillInfo() {

        JPanel panel = new JPanel();
        panel.setBounds(5,5,900,500);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(10,40,870,380);
        panel.add(sp);

        try {

            conn c = new conn();

            ResultSet rs =
            c.statement.executeQuery(
            "select * from billing");

            table.setModel(
            DbUtils.resultSetToTableModel(rs));

        } catch(Exception e) {
            e.printStackTrace();
        }

        JButton back = new JButton("Back");
        back.setBounds(380,440,120,30);
        panel.add(back);

        back.addActionListener(e -> setVisible(false));

        setSize(920,550);
        setLocation(300,120);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BillInfo();
    }
}
