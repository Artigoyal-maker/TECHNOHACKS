package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BillingManagement extends JFrame implements ActionListener {

    JButton generateBtn, viewBtn, backBtn;

    BillingManagement() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109, 164, 170));
        panel.setBounds(5, 5, 500, 400);
        add(panel);

        JLabel heading = new JLabel("Billing Management");
        heading.setBounds(120, 30, 300, 35);
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        panel.add(heading);

        generateBtn = new JButton("Generate Bill");
        generateBtn.setBounds(150, 100, 180, 35);
        panel.add(generateBtn);

        viewBtn = new JButton("View Bills");
        viewBtn.setBounds(150, 160, 180, 35);
        panel.add(viewBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(150, 220, 180, 35);
        panel.add(backBtn);

        generateBtn.addActionListener(this);
        viewBtn.addActionListener(this);
        backBtn.addActionListener(this);

        setSize(520, 400);
        setLocation(450, 180);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == generateBtn) {
            new GenerateBill(); 
        }
        else if(e.getSource() == viewBtn) {
            new BillInfo(); 
        }
        else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BillingManagement();
    }
}
