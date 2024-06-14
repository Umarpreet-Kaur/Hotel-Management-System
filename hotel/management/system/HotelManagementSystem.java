package hotel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class HotelManagementSystem extends JFrame implements ActionListener{
    HotelManagementSystem(){
        // setSize(1366,565);
        // setLocation(100,100);
        setBounds(100,100,1366,565);
        setLayout(null);
        

        // set img--------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.png"));
        JLabel image= new JLabel(i1);
        image.setBounds(0,0, 1366, 565); //loc X, loc y, len , breadth
        add(image);

        // add text----------------
        JLabel text1 =new JLabel("Hotel Management");
        JLabel text2 =new JLabel("System");

        text1.setBounds(100, 423, 900, 60);
        text1.setForeground(Color.black);
        text1.setFont(new Font("serif", Font.BOLD,45));
        image.add(text1);
        
        text2.setBounds(200, 460, 500, 60);
        text2.setForeground(Color.black);
        text2.setFont(new Font("serif", Font.BOLD,45));
        image.add(text2);

        // next pg btn----------------
        JButton next = new JButton("Next");
        next.setBounds(1150,450,115,50);
        next.setForeground(Color.black);
        next.setFont(new Font("serif", Font.BOLD,15));
        next.addActionListener(this);
        image.add(next);

        setVisible(true);

        // for making text as dipper-----------------
        while (true) {
            text1.setVisible(false);
            text2.setVisible(false);
            try{
                Thread.sleep(500);
            } catch(Exception e){
                e.printStackTrace();
            }
            text1.setVisible(true);
            text2.setVisible(true);
            try{
                Thread.sleep(600);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();    
    }
    
    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}