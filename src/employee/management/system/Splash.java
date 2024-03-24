package employee.management.system;



import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
 

public class Splash extends JFrame implements ActionListener{
    
    Splash()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setForeground(Color.red);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        add(heading); 
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);
        
        JButton Clickhere = new JButton("CLICK HERE TO CONTINUE");
        Clickhere.setBounds(400,400,300,70);
        Clickhere.setBackground(Color.BLACK);
        Clickhere.setForeground(Color.white);
        Clickhere.addActionListener(this);
        image.add(Clickhere);     
        
        
        
        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
        
        while(true)
        {
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                
            }
            heading.setVisible(true);
            
            try{
                Thread.sleep(500);
            }catch(Exception e){
                
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Splash();
    }
}
