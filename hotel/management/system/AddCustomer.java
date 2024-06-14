
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class AddCustomer extends JFrame {
    
    JComboBox comboid;
    JTextField tfno, tfname, tfcountry;
    JRadioButton rmale,rfemale;
    Choice croom;
    
    AddCustomer(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel text = new JLabel("NEW CUSTOMER FORM");
        text.setBounds(100,20,300,30);
        text.setFont(new Font("Raleway",Font.BOLD,22));
        add(text);
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(35,80,100,20);
        lblid.setFont(new Font("Raleway",Font.PLAIN,18));
        add(lblid);
        
        String op[]={"Aadhar Card","Passport","Driving Licence", "Voter Id Card","Ration Card"};
        comboid = new JComboBox(op);
        comboid.setBounds(200,80,150,25);
        comboid.setBackground(Color.white);
        add(comboid);
        
        JLabel lblno = new JLabel("Number");
        lblno.setBounds(35,120,100,20);
        lblno.setFont(new Font("Raleway",Font.PLAIN,18));
        add(lblno);
        
        tfno = new JTextField();
        tfno.setBounds(200,120,150,25);
        add(tfno);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(35,160,100,20);
        lblname.setFont(new Font("Raleway",Font.PLAIN,18));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,160,150,25);
        add(tfname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(35,200,100,20);
        lblgender.setFont(new Font("Raleway",Font.PLAIN,18));
        add(lblgender);
        
        rmale =new JRadioButton("Male");
        rmale.setBackground(Color.white);
        rmale.setBounds(200,200,60,25);
        add(rmale);
        
        rfemale =new JRadioButton("Female");
        rfemale.setBackground(Color.white);
        rfemale.setBounds(270,200,100,25);
        add(rfemale);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(35,240,100,20);
        lblcountry.setFont(new Font("Raleway",Font.PLAIN,18));
        add(lblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(200,240,150,25);
        add(tfcountry);
        
        JLabel lblroom = new JLabel("Room Number");
        lblroom.setBounds(35,280,140,20);
        lblroom.setFont(new Font("Raleway",Font.PLAIN,18));
        add(lblroom);
        
        croom = new Choice();
        try {
            Conn c = new Conn();
            String query= "select * from room";
            ResultSet rs= c.s.executeQuery(query);
            while(rs.next()){
                croom.add(rs.getString("roomnumber"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        croom.setBounds(200,280,150,25);
        add(croom);
        
        JLabel lbltime = new JLabel("CheckIn Time");
        lbltime.setBounds(35,280,140,20);
        lbltime.setFont(new Font("Raleway",Font.PLAIN,18));
        add(lbltime);
        
        setBounds(350,200,800,550);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new AddCustomer();
    }
}
