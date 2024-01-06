package ToDoList;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UI extends JFrame {
    private JLabel label1;
    private JTextField tF1Field, tF2Field;
    private JButton addButton, exitButton;
    private ArrayList<JButton> todoArray;
    private JPanel buttonPanel;

    public UI() {
        todoArray = new ArrayList<>();

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label1 = new JLabel("To-Do List");
        tF1Field = new JTextField("Add Job", 20);
        addButton = new JButton("Add");
        exitButton = new JButton("Exit");

        JScrollPane scrollPane = new JScrollPane(buttonPanel);

        container.add(label1);
        container.add(tF1Field);
        container.add(addButton);
        container.add(exitButton);
        container.add(scrollPane);
        tF2Field = new JTextField(20);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = tF1Field.getText();
                JButton newButton = new JButton(s);
                todoArray.add(newButton);
                buttonPanel.add(newButton);
                addDeleteButton(newButton);
                validate();
                repaint();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        container.add(buttonPanel);

        
        
    }
    private void addDeleteButton(JButton todoButton) {
        String s=todoButton.getText();
        JButton deleteButton = new JButton(s);
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                todoArray.remove(todoButton);
                buttonPanel.remove(todoButton);
                validate();
                repaint();
            }
        });
        todoButton.add(deleteButton);
    }
    public static void main(String[] args) {
        UI ui = new UI();
        ui.setSize(400, 300);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
    }
}
