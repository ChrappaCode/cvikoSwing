package sk.stuba.fei.uim.oop;

import java.awt.*;

public class MyCanvas extends Canvas {

    public MyCanvas() {

        setBackground(Color.green);

    }

    public void paint(Graphics g)
    {
        /*int x1,x2,y1,y2; //future x and y coordinates
        int radius=125; //radius of first circle
        int xMid=250, yMid=250; //center point (x,y) of circle

        //draw invisible line
        g.drawLine(0,250,500,250);

        //draw first circle
        g.drawOval(xMid-radius,yMid-radius,radius*2,radius*2);


        //run fractal algorithm to draw 2 circles to the left and right
        drawCircles(g, xMid, yMid, radius);*/

        /*myStar(g);
        myStar2(g);*/

        gula1(g);
        gula2(g);
        gula3(g);
        gula4(g);
        gula5(g);
        ciarka1(g);
    }

    public void myStar(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(100,100,40,40);
        g.setColor(Color.BLUE);
        g.fillPolygon(new int[] {100, 140, 120}, new int[] {100, 100, 30}, 3);
        g.fillPolygon(new int[] {140, 140, 210}, new int[] {100, 140, 120}, 3);
        g.fillPolygon(new int[] {100, 140, 120}, new int[] {140, 140, 210}, 3);
        g.fillPolygon(new int[] {100, 100, 30}, new int[] {100, 140, 120}, 3);
    }

    public void myStar2(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(200,200,40,40);
        g.setColor(Color.RED);
        g.fillPolygon(new int[] {200, 240, 220}, new int[] {200, 200, 130}, 3);
        g.fillPolygon(new int[] {240, 240, 310}, new int[] {200, 240, 220}, 3);
        g.fillPolygon(new int[] {200, 240, 220}, new int[] {240, 240, 310}, 3);
        g.fillPolygon(new int[] {200, 200, 130}, new int[] {200, 240, 220}, 3);
    }

    public void gula1(Graphics g)
    {
        g.setColor(Color.cyan);
        g.fillArc(150,150,100,100,0,360);

    }
    public void gula2(Graphics g)
    {
        g.setColor(Color.magenta);
        g.fillArc(150,250,100,100,0,360);

    }
    public void gula3(Graphics g)
    {
        g.setColor(Color.orange);
        g.fillArc(250,150,100,100,0,360);

    }
    public void gula4(Graphics g)
    {
        g.setColor(Color.red);
        g.fillArc(250,250,100,100,0,360);

    }
    public void gula5(Graphics g)
    {
        g.setColor(Color.black);
        g.fillArc(230,230,45,45,0,360);

    }
    public void ciarka1(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.drawLine(250,250,500,250);

    }

    void drawCircles (Graphics graphics, int xMid, int yMid, int radius)
    {

        if(radius < 3)
            return;

        //used to position left and right circles
        int x1 = xMid-radius-(radius/2);
        int y1 = yMid-(radius/2);
        int x2 = xMid+radius-(radius/2);
        int y2= yMid-(radius/2);

        if (radius > 3)
        {
            //draw circle to the left
            graphics.drawOval(x1, y1, (radius/2)*2, (radius/2)*2);

            //draw circle to the right
            graphics.drawOval(x2, y2, (radius/2)*2, (radius/2)*2);
        }

        drawCircles (graphics, xMid, yMid, radius/2);
    }
}
