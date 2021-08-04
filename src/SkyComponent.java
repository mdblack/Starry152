//this is where the drawing will happen

import javax.swing.*;
import java.awt.*;

public class SkyComponent extends JComponent
{
    //draws the 100 stars
    protected void paintComponent(Graphics g)
    {
        //make the sky black - make a really big rectangle to fill screen
        g.setColor(Color.BLACK);
        g.fillRect(0,0,Sky.WIDTH,Sky.HEIGHT);

        //do this 100 times to get 100 stars
        for(int i=0; i<100; i=i+1) {
            //tell the star to draw itself
            Sky.star[i].draw(g);

        }
    }
}
