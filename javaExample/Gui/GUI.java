package Gui;
import javax.swing.JFrame;

public class  GUI {
     public static void main(String[] args) {
        UI ui = new UI();
        ui.setSize(300, 200);
        ui.setTitle("Simple UI");
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
    }
}
