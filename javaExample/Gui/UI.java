package Gui;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI extends JFrame{
    protected JLabel label1;
    protected JTextField tF1Field,tF2Field;
    protected JButton  buton1,buton2,buton3;
    
    public UI(){
        Container container=getContentPane();


        container.setLayout(new FlowLayout());
        label1=new JLabel("DENEME1");
        tF1Field=new JTextField("gir bişiler",20);
        buton1=new JButton("buton1");
        buton2=new JButton("ekrana bas");
        buton3=new JButton("denemeeee");
        container.add(label1);
        container.add(tF1Field);
        container.add(buton1);
        container.add(buton3);
        container.add(buton2);
        tF2Field=new JTextField(20);
        container.add(tF2Field);
        

        buton1.addActionListener(new EventHandler());
        buton2.addActionListener(new EventHandler());
        buton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tF2Field.setText("deneme buton clicked");
            }
        });
    }
    public class EventHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s =tF1Field.getText();
            System.out.println(s);
            if(e.getSource()==buton1){
                System.exit(0);
            }else if(e.getSource()==buton2){
                tF2Field.setText("Button clicked!");
            }

        }
    }
   

}
