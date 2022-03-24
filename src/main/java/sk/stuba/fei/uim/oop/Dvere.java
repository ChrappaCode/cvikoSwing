package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Dvere extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        this.niecoKresli(g);

    }

    private void niecoKresli(Graphics g){

        g.setColor(Color.RED);
        g.fillRect(50,50,80,140);

        g.setColor(Color.cyan);

        g.fillRect(55,55,15,60);

        g.fillRect(55,125,15,60);

        g.fillRect(110,55,15,60);

        g.fillRect(110,125,15,60);

        g.setColor(Color.black);
        g.fillRect(112,118,15,4);


    }


}
