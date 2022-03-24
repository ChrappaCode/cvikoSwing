package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {


    @Override
    protected void paintComponent(Graphics g) {

        this.niecoKresli(g);

    }

    private void niecoKresli(Graphics g){

        g.setColor(Color.GRAY);
        g.fillRect(100,100,40,40);
        g.setColor(Color.BLUE);
        g.fillPolygon(new int[] {100, 140, 120}, new int[] {100, 100, 30}, 3);
        g.fillPolygon(new int[] {140, 140, 210}, new int[] {100, 140, 120}, 3);
        g.fillPolygon(new int[] {100, 140, 120}, new int[] {140, 140, 210}, 3);
        g.fillPolygon(new int[] {100, 100, 30}, new int[] {100, 140, 120}, 3);


    }


}
