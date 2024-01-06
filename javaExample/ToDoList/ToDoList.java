package ToDoList;

import javax.swing.JFrame;

public class ToDoList {
    public static void main(String[] args) {
        UI ui = new UI();
        ui.setSize(900, 600);
        ui.setTitle("TODO LİST");
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
    }
}
