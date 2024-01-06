package Lab;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



public class AllInOne extends JFrame {
    private JPanel mousePanel,mousePanel2;
    private JButton button1,button2;
    private JRadioButton radioButton1,radioButton2,radioButton3;
    private JCheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    private JLabel label1,label2,label3;
    ButtonGroup radioGroup;
    public AllInOne(){
        Container c=getContentPane();
        c.setLayout(new GridLayout(4,6));
        mousePanel=new JPanel(); mousePanel2=new JPanel();
        mousePanel.setBackground(Color.BLUE);
        mousePanel2.setBackground(Color.CYAN);
        label1 =new JLabel();
        label2 =new JLabel();
        label3=new JLabel();

        radioButton1=new JRadioButton("Blue",false);
        radioButton2=new JRadioButton("Green",false);
        radioButton3=new JRadioButton("Red",false);
        radioGroup=new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        radioGroup.add(radioButton3);

        checkBox1=new JCheckBox("Math");
        checkBox2=new JCheckBox("OOP");
        checkBox3=new JCheckBox("Algorithm");
        checkBox4=new JCheckBox("Microprocessor");



        c.add(mousePanel);
        c.add(mousePanel2);
        c.add(label1);
        c.add(radioButton1); c.add(radioButton2); c.add(radioButton3);
        c.add(label2);
        c.add(checkBox1);c.add(checkBox2);c.add(checkBox3);c.add(checkBox4);
        c.add(label3);
        MouseHandle mouseHandle=new MouseHandle();
        c.addMouseListener(mouseHandle);
        RadioButtonHandle radioButtonHandle=new RadioButtonHandle();
        radioButton1.addItemListener(radioButtonHandle);
        radioButton2.addItemListener(radioButtonHandle);
        radioButton3.addItemListener(radioButtonHandle);

        CheckBoxHandle checkBoxHandle=new CheckBoxHandle();
        checkBox1.addItemListener(checkBoxHandle);
        checkBox2.addItemListener(checkBoxHandle);
        checkBox3.addItemListener(checkBoxHandle);
        checkBox4.addItemListener(checkBoxHandle);
    }

    public class MouseHandle implements MouseListener {
    
    public void mouseClicked(MouseEvent e) {
        mousePanel.setBackground(Color.RED);
    }

   
    public void mousePressed(MouseEvent e) {
        mousePanel.setBackground(Color.GRAY);
    }

   
    public void mouseReleased(MouseEvent e) {
        mousePanel.setBackground(Color.ORANGE);
    }

   
    public void mouseEntered(MouseEvent e) {
        label1.setText("Location: "+e.getX()+"  -  "+e.getY());
        mousePanel.setBackground(Color.BLACK);
    }

   
    public void mouseExited(MouseEvent e) {
        mousePanel.setBackground(Color.BLUE);
    }


    }

    public class RadioButtonHandle implements ItemListener{

        
        public void itemStateChanged(ItemEvent e) {
            if(e.getItem()==radioButton1){
                label2.setText("Blue");
                label2.setForeground(Color.BLUE);
            }
            else if(e.getItem()==radioButton2){
                label2.setText("Green");
                label2.setForeground(Color.GREEN);
            }
            else{
                label2.setText("Red");
                label2.setForeground(Color.RED);
            }
            
        }

    }
    public class CheckBoxHandle implements ItemListener {

        
        public void itemStateChanged(ItemEvent e) {
            String s=" ";
           if(checkBox1.isSelected()){
                s+="Math Done ";
                label3.setText(s);
           }
           else if(checkBox2.isSelected()){
                s+="OOP Done ";
                label3.setText(s);
           }
           else if(checkBox3.isSelected()){
                s+="Algorithm Done ";
                label3.setText(s);
           }
           else if(checkBox4.isSelected()){
                s+="Microprocessor Done ";
                label3.setText(s);
           }
        }
        
        
    }


    public static void main(String[] args) {
         AllInOne allInOne = new AllInOne();
        allInOne.setSize(400, 300);
        allInOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        allInOne.setVisible(true);
    }
}
