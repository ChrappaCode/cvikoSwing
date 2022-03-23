package sk.stuba.fei.uim.oop;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("hi");
        JFrame frame = new JFrame("Sak teda ako chlap ne");

        //JButton button =new JButton("Aby ta roztrhalo");
        //JLabel label = new JLabel("kokotek");
        // .setBounds(150,60,200,40);
        //button.setBounds(100,100,200, 40);
        //frame.add(button);
        //frame.add(label);

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        Place place = new Place();

        place.placeComponents(panel);


        frame.setVisible(true);
    }


}
