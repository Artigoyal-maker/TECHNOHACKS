package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class GenerateBill extends JFrame implements ActionListener {

    Choice patientChoice;
    JTextField tfRoomCharge, tfDoctorFee, tfMedicineCharge;
    JComboBox<String> statusBox;
    JButton generateBtn, backBtn;

    GenerateBill() {

        JPanel panel = new JPanel();
        panel.setBounds(5,5,650,500);
        panel.setBackground(new Color(109,164,170));
        panel.setLayout(null);
        add(panel);

        JLabel heading = new JLabel("Generate Bill");
        heading.setBounds(220,20,250,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,22));
        panel.add(heading);

        JLabel l1 = new JLabel("Patient");
        l1.setBounds(50,90,150,25);
        panel.add(l1);

        patientChoice = new Choice();

        try{
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("SELECT Name FROM patient_info");
            while(rs.next()){
                patientChoice.add(rs.getString("Name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        patientChoice.setBounds(220,90,200,25);
        panel.add(patientChoice);

        JLabel l2 = new JLabel("Room Charge");
        l2.setBounds(50,140,150,25);
        panel.add(l2);

        tfRoomCharge = new JTextField();
        tfRoomCharge.setBounds(220,140,200,25);
        tfRoomCharge.setEditable(false);
        panel.add(tfRoomCharge);

        JLabel l3 = new JLabel("Doctor Fee");
        l3.setBounds(50,190,150,25);
        panel.add(l3);

        tfDoctorFee = new JTextField();
        tfDoctorFee.setBounds(220,190,200,25);
        tfDoctorFee.setEditable(false);
        panel.add(tfDoctorFee);

        JLabel l4 = new JLabel("Medicine Charge");
        l4.setBounds(50,240,150,25);
        panel.add(l4);

        tfMedicineCharge = new JTextField();
        tfMedicineCharge.setBounds(220,240,200,25);
        panel.add(tfMedicineCharge);

        JLabel l5 = new JLabel("Payment Status");
        l5.setBounds(50,290,150,25);
        panel.add(l5);

        statusBox = new JComboBox<>(new String[]{"Paid","Pending"});
        statusBox.setBounds(220,290,200,25);
        panel.add(statusBox);

        patientChoice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{
                    conn c = new conn();
                    ResultSet rs1 = c.statement.executeQuery( "SELECT r.Price " +
                            "FROM patient_info p, room r " +
                            "WHERE p.Room_Number = r.room_no " +
                            "AND p.Name='" + patientChoice.getSelectedItem() + "'");
                    if(rs1.next()){
                        tfRoomCharge.setText(rs1.getString("Price"));
                    }
                    ResultSet rs2 = c.statement.executeQuery( "SELECT d.Doctor_Fee " +
                            "FROM appointment a, doctor d " +
                            "WHERE a.Doctor_Name=d.Name " +
                            "AND a.Patient_Name='" + patientChoice.getSelectedItem() + "'");
                    if(rs2.next()){
                        tfDoctorFee.setText(rs2.getString("Doctor_Fee"));
                    }else{
                        tfDoctorFee.setText("0");
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // First patient load
        if(patientChoice.getItemCount()>0){
            try{
                conn c = new conn();
                ResultSet rs1 = c.statement.executeQuery( "SELECT r.Price " +
                        "FROM patient_info p, room r " +
                        "WHERE p.Room_Number=r.room_no " +
                        "AND p.Name='" + patientChoice.getSelectedItem() + "'");
                if(rs1.next()){
                    tfRoomCharge.setText(rs1.getString("Price"));
                }
                ResultSet rs2 = c.statement.executeQuery( "SELECT d.Doctor_Fee " +
                        "FROM appointment a, doctor d " +
                        "WHERE a.Doctor_Name=d.Name " +
                        "AND a.Patient_Name='" + patientChoice.getSelectedItem() + "'");
                if(rs2.next()){
                    tfDoctorFee.setText(rs2.getString("Doctor_Fee"));
                }else{
                    tfDoctorFee.setText("0");
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }

        generateBtn = new JButton("Generate");
        generateBtn.setBounds(140,370,120,35);
        generateBtn.addActionListener(this);
        panel.add(generateBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(320,370,120,35);
        backBtn.addActionListener(this);
        panel.add(backBtn);

        setSize(670,520);
        setLocation(350,150);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==generateBtn){
            if(tfMedicineCharge.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null,"Enter Medicine Charge");
                return;
            }
            try{
                int roomCharge = Integer.parseInt(tfRoomCharge.getText());
                int doctorFee = Integer.parseInt(tfDoctorFee.getText());
                int medicineCharge = Integer.parseInt(tfMedicineCharge.getText());

                int total = roomCharge + doctorFee + medicineCharge;

                conn c = new conn();
                String q = "INSERT INTO billing(patient_name,room_charge,doctor_fee,medicine_charge,total_amount,bill_date,payment_status) VALUES('"
                        + patientChoice.getSelectedItem() + "',"
                        + roomCharge + ","
                        + doctorFee + ","
                        + medicineCharge + ","
                        + total + ",CURDATE(),'"
                        + statusBox.getSelectedItem() + "')";

                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Bill Generated Successfully\n\nTotal Amount : ₹"+total);
                setVisible(false);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new GenerateBill();
    }

}
