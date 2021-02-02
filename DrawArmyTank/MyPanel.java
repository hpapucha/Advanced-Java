import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel {
//Mypanel method
    public MyPanel( ) {
        setBackground(Color.orange);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        // Print title.
        g.setFont(new Font("arial", Font.BOLD, 30));
        g.setColor(Color.black);
        g.drawString("TANK FIRING 2D DRAWING", 80, 40);


        // Tank Body
        g.setColor(Color.darkGray);
        g.fillRect(70, 250, 350, 100);
        g.setColor(Color.darkGray);
        g.drawRect(70, 250, 350, 100);

        // Hull
        g.setColor(Color.darkGray);
        g.fillRect(150, 200, 150, 100);
        g.setColor(Color.darkGray);
        g.drawRect(150, 200, 150, 100);

        // Hull Entrance
        g.setColor(Color.red);
        g.fillRect(170, 185, 60, 15);
        g.setColor(Color.red);
        g.drawRect(170, 185, 60, 15);

        //Gun
        g.setColor(Color.darkGray);
        g.fillRect(290, 220, 200, 10);
        g.setColor(Color.darkGray);
        g.drawRect(290, 220, 200, 10);

        //Gun front
        g.setColor(Color.red);
        g.fillRect(480, 215, 15, 25);
        g.setColor(Color.red);
        g.drawRect(480, 215, 15, 25);

        //Projectile
        g.setColor(Color.red);
        g.fillOval(520, 215, 20, 20);
        g.setColor(Color.red);
        g.drawOval(520, 215, 20, 20);

        //Gun Front Plate Triangle
        g.setColor(Color.red);
        int x[]={420,460,420};
        int y[]={350,290,250};
        g.fillPolygon(x,y, 3);


        // Track
        g.setColor(Color.black);
        g.drawRect(70, 350, 350, 40);

        //Wheels starting from left to right
        g.setColor(Color.red);
        g.fillOval(70, 350, 40, 40);
        g.setColor(Color.red);
        g.drawOval(70, 350, 40, 40);

        g.setColor(Color.red);
        g.fillOval(120, 350, 40, 40);
        g.setColor(Color.red);
        g.drawOval(120, 350, 40, 40);

        g.setColor(Color.red);
        g.fillOval(170, 350, 40, 40);
        g.setColor(Color.red);
        g.drawOval(170, 350, 40, 40);

        g.setColor(Color.red);
        g.fillOval(220, 350, 40, 40);
        g.setColor(Color.red);
        g.drawOval(220, 350, 40, 40);

        g.setColor(Color.red);
        g.fillOval(270, 350, 40, 40);
        g.setColor(Color.red);
        g.drawOval(270, 350, 40, 40);

        g.setColor(Color.red);
        g.fillOval(320, 350, 40, 40);
        g.setColor(Color.red);
        g.drawOval(320, 350, 40, 40);

        g.setColor(Color.red);
        g.fillOval(370, 350, 40, 40);
        g.setColor(Color.red);
        g.drawOval(370, 350, 40, 40);

        //Body Star
        g.setColor(Color.red);
        int t[]  = {200,220,240,190,250,200,400};
        int z[] = {330,280,330,300,300,320,400};
        g.fillPolygon(t, z, 5);

        //Tank Number
        g.setFont(new Font("arial", Font.BOLD, 30));
        g.setColor(Color.red);
        g.drawString("334", 160, 240);


    }
}