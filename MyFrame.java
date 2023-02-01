import javax.swing.*;

/**
 * The class MyFrame is used
 * to make the first panel that opens 
 * up the program
 */

public class MyFrame extends JFrame{
    MyPanel panel;
    
    MyFrame(){
        panel = new MyPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}