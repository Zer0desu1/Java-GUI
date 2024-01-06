package Gui;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Window extends JFrame {
    

    public Window(){
        setTitle("TestApp");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        JTextField textField = new JTextField("Type here");
        textField.setBounds(50,50, 150,20);  
        
        JButton exitB = new JButton("Exit");
        exitB.setBounds(50,100,95,30);  
        


        c.add(exitB);
        c.add(textField);
        setSize(400, 400);
        setVisible(true);
    }
    public Window(JButton b1){
        setTitle("TestApp");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        JButton exitB = new JButton("Exit");
        exitB.setBounds(0,0,100,40);
        b1.setBounds(120,120,40,40);
        c.add(exitB); 
        c.add(b1); 
        setVisible(true);
    }

    public Window(JLabel l1,JLabel l2){
        setTitle("TestApp");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        l1.setBounds(50,50, 100,30);  
        c.add(l1);
        l2.setBounds(50,200, 100,30);  
        c.add(l2);
        System.out.println(l2.getBounds());
        setVisible(true);
    }

    public static void main(String[] args) {
        //new Window(new JButton("TestButton"));
        JLabel l1=new JLabel("label 1");
        JLabel l2=new JLabel("label 2");
        
       new Window(l1,l2);
       //new Window(button1);

    }
}
