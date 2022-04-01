package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {


        /*JFrame okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300, 300);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(new GridLayout(3,4));

        for (int i = 0; i < 11; i++) {

            if(i == 0){
                okno.add(new Dvere());
            }
            else
                okno.add(new MyPanel());

        }

        JFrame okno = new JFrame();
        okno.setSize(500,500);
        okno.setLocation(100,100);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno.add(new MyCanvas());


        okno.setVisible(true);*/

        JFrame okno = new JFrame();

        okno.setSize(600, 600);
        okno.setResizable(true);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel(new FlowLayout());
        JButton button1 = new JButton("tlacitko 1");
        JButton button2 = new JButton("tlacitko 2");
        JButton button3 = new JButton("tlacitko 3");
        JButton button4 = new JButton("tlacitko 4");

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);

        okno.add(panel1, BorderLayout.PAGE_START);

        JPanel panel3 = new JPanel(new BorderLayout());

        okno.add(new MyCanvas());


        JButton button5 = new JButton("OK");
        JButton button6 = new JButton("CANCEL");
        JLabel label = new JLabel("Ahoj, ako sa máš");


        panel3.add(label , BorderLayout.PAGE_START);
        panel3.add(button5 , BorderLayout.LINE_START);
        panel3.add(button6 , BorderLayout.LINE_END);

        okno.add(panel3 , BorderLayout.PAGE_END);


        okno.setVisible(true);

    }
}

