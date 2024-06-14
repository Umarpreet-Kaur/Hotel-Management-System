package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Reception extends JFrame {
    Reception(){
        getContentPane().setBackground(Color.white); 
        setLayout(null);
        
        JButton newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.black);
        newCustomer.setForeground(Color.white);
        add(newCustomer);
        
        JButton rooms = new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.black);
        rooms.setForeground(Color.white);
        add(rooms);
        
        JButton department = new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.black);
        department.setForeground(Color.white);
        add(department);
        
        JButton allEmp = new JButton("All Emplpoyees");
        allEmp.setBounds(10,150,200,30);
        allEmp.setBackground(Color.black);
        allEmp.setForeground(Color.white);
        add(allEmp);
        
        JButton customers = new JButton("Customers Info");
        customers.setBounds(10,190,200,30);
        customers.setBackground(Color.black);
        customers.setForeground(Color.white);
        add(customers);
        
        JButton managerInfo = new JButton("Manager Info");
        managerInfo.setBounds(10,230,200,30);
        managerInfo.setBackground(Color.black);
        managerInfo.setForeground(Color.white);
        add(managerInfo);
        
        JButton checkout = new JButton("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.black);
        checkout.setForeground(Color.white);
        add(checkout);
        
        JButton update = new JButton("Update Status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.black);
        update.setForeground(Color.white);
        add(update);
        
        JButton roomStatus = new JButton("Update Room Status");
        roomStatus.setBounds(10,350,200,30);
        roomStatus.setBackground(Color.black);
        roomStatus.setForeground(Color.white);
        add(roomStatus);
        
        JButton pickup = new JButton("Pickup Service");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.black);
        pickup.setForeground(Color.white);
        add(pickup);
        
        JButton searchRoom = new JButton("Search Romm");
        searchRoom.setBounds(10,430,200,30);
        searchRoom.setBackground(Color.black);
        searchRoom.setForeground(Color.white);
        add(searchRoom);
        
        JButton logout = new JButton("LogOut");
        logout.setBounds(10,430,200,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.png"));
        Image i2 = i1.getImage().getScaledInstance(500, 470, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(250,5,500,470);
        add(image);
        
        setBounds(350,200,800,570);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Reception();
    }
}
