import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class OopTet extends JFrame  {
    private JButton saveButton,button2,button3;
    private JLabel nameL,sexL,hobbyL,clickL;
    private JRadioButton hobby1,hobby2;
    private ButtonGroup genderButtonGroup; 
    private int clickCount = 0;
    private JTextField text;
    JCheckBox male;
    JCheckBox female;
    public OopTet(){
        JPanel namPanel=new JPanel();
        JPanel gendPanel=new JPanel();
        JPanel hobJPanel=new JPanel();
        JPanel savJPanel=new JPanel();
        JPanel maiPanel=new JPanel();
        namPanel.setLayout(new GridLayout(1,2));
        gendPanel.setLayout(new GridLayout(1,3));
        hobJPanel.setLayout(new GridLayout(1,3));
        savJPanel.setLayout(new GridLayout(2,1));
        maiPanel.setLayout(new GridLayout(4,1));

        maiPanel.add(namPanel);
        maiPanel.add(gendPanel);
        maiPanel.add(hobJPanel);
        maiPanel.add(savJPanel);

        Container c=getContentPane();
        saveButton = new JButton("KAYIT ET");
        nameL = new JLabel("ISIM");
        sexL = new JLabel("CİNSİYET");
        hobbyL = new JLabel("HOBİ");
        clickL = new JLabel(String.valueOf(clickCount));
        hobby1=new JRadioButton("Yüzme");
        hobby2=new JRadioButton("Satranç");
        text=new JTextField(20);
        genderButtonGroup = new ButtonGroup();

         male = new JCheckBox("ERKEK");
         female = new JCheckBox("KADIN");
        genderButtonGroup.add(male);
        genderButtonGroup.add(female);
        BorderLayout b = new BorderLayout();
        c.setLayout(b);
        c.add(maiPanel);
        namPanel.add(nameL); namPanel.add(text);
        gendPanel.add(sexL); gendPanel.add(male); gendPanel.add(female);
        hobJPanel.add(hobbyL); hobJPanel.add(hobby1); hobJPanel.add(hobby2);
        savJPanel.add(saveButton); savJPanel.add(clickL);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                clickL.setText(String.valueOf(clickCount));

                System.out.println("Kayıt edildi");
                refresh();
            }
        });
    }

    public void refresh(){
        text.setText("");
        genderButtonGroup.setSelected(male.getModel() , false);
        hobby1.setSelected( false);
        hobby2.setSelected(false);
    }








    public static void main(String[] args) {
        OopTet test=new OopTet();
        test.setSize(600,400);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
        test.setResizable(false);
    }
}
