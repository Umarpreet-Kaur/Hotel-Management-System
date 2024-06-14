package hotel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{
    Dashboard(){
        setBounds(0,0,1550,1000);

        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/third.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);

        JLabel text = new JLabel("Welcome to our Hotel System!");
        text.setBounds(400,80,1000,50);
        text.setFont(new Font("Tahoma", Font.BOLD,46));
        text.setForeground(Color.black);
        image.add(text);

        JMenuBar mb =new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);

        JMenu hotel =new JMenu("Hotel Management");
        hotel.setForeground(Color.gray);
        hotel.setBounds(20,0,50,25);
        mb.add(hotel);

        JMenuItem reception =new JMenuItem("Reception");
        reception.addActionListener(this);
        hotel.add(reception);
        
        hotel.add(reception);

        JMenu admin =new JMenu("Admin");
        admin.setForeground(Color.gray);
        admin.setBounds(100,0,50,25);
        mb.add(admin);

        JMenuItem addEmp = new JMenuItem("Add Employee");
        addEmp.addActionListener(this);
        admin.add(addEmp);

        JMenuItem addRoom = new JMenuItem("Add Rooms");
        addRoom.addActionListener(this);
        admin.add(addRoom);
        
        JMenuItem addDriver = new JMenuItem("Add Drivers");
        addDriver.addActionListener(this);
        admin.add(addDriver);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Add Employee")){
            new AddEmployee();
        }
        else if(ae.getActionCommand().equals("Add Rooms")){
            new AddRooms();
        }
        else if(ae.getActionCommand().equals("Add Drivers")){
            new AddDriver();
        }
        else if(ae.getActionCommand().equals("Reception")){
            new Reception();
        }
    }
    
    public static void main(String[] args) {
        new Dashboard();
    }

   
    
}
