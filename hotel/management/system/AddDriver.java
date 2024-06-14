
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddDriver extends JFrame implements ActionListener{
    JButton add, cancel;
    JTextField tfname, tfage,tfcomp,tfmodel,tfloc;
    JComboBox typecombo,gendercombo,avablcombo;
    
    AddDriver(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Drivers");
        heading.setFont(new Font("Tahoma", Font.BOLD,18));
        heading.setBounds(150,10,200,20);
        add(heading);
        
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblname.setBounds(60,70,120,30);
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,70,150,30);
        add(tfname);
        
        JLabel lblage = new JLabel("Age");
        lblage.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblage.setBounds(60,110,120,30);
        add(lblage);
        
        tfage = new JTextField();
        tfage.setBounds(200,110,150,30);
        add(tfage);
          
        JLabel lblgender = new JLabel("Gender");
        lblgender.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblgender.setBounds(60,150,120,30);
        add(lblgender);
        
        String cleanOp[]={"Male", "Female"};
        gendercombo = new JComboBox(cleanOp);
        gendercombo.setBounds(200,150,150,30);
        gendercombo.setBackground(Color.white);
        add(gendercombo);
        
        JLabel lblcomp = new JLabel("Car Company");
        lblcomp.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblcomp.setBounds(60,190,120,30);
        add(lblcomp);
        
        tfcomp = new JTextField();
        tfcomp.setBounds(200,190,150,30);
        add(tfcomp);
        
        JLabel lbltype = new JLabel("Car Model");
        lbltype.setFont(new Font("Tahoma", Font.PLAIN,16));
        lbltype.setBounds(60,230,120,30);
        add(lbltype);
        
        tfmodel = new JTextField();
        tfmodel.setBounds(200,230,150,30);
        add(tfmodel);
        
        JLabel lblavailable = new JLabel("Available");
        lblavailable.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblavailable.setBounds(60,270,120,30);
        add(lblavailable);
        
        String avablOp[]={"Available", "Occupied"};
        avablcombo = new JComboBox(avablOp);
        avablcombo.setBounds(200,270,150,30);
        avablcombo.setBackground(Color.white);
        add(avablcombo);
        
        JLabel lblloc = new JLabel("Location");
        lblloc.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblloc.setBounds(60,310,120,30);
        add(lblloc);
        
        tfloc = new JTextField();
        tfloc.setBounds(200,310,150,30);
        add(tfloc);
        
        add = new JButton("Add Driver");
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.setBounds(60,370,130,30);
        add.addActionListener(this);
        add(add);
        
        cancel = new JButton("Cancel");
        cancel.setForeground(Color.white);
        cancel.setBackground(Color.black);
        cancel.setBounds(220,370,130,30);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.png"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,30,500,300);
        add(image);
        
        
        
        setBounds(300,200,980,470);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==add){
            String name=tfname.getText();
            String age = tfage.getText();
            String gender = (String) gendercombo.getSelectedItem();
            String company= tfcomp.getText();
            String brand =tfmodel.getText();
            String available = (String) avablcombo.getSelectedItem();
            String location= tfloc.getText();
            try {
                Conn conn= new Conn();
                String str = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";
                
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "New Driver Added Successfully!");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AddDriver();
    }

    
}
