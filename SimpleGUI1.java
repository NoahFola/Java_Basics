import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class SimpleGUI1 implements ActionListener{
    JButton button;
    myDrawPanel panel;
    public static void main(String[] args) {
        SimpleGUI1 gui = new SimpleGUI1();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");
        panel = new myDrawPanel();
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
    button.setText("I've been clicked!");
    }   
    
}

class myDrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20,50, 100, 100);
    }
}
