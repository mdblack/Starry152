import java.awt.*;

public class Moon extends Star
{
    //override draw to draw an oval instead of a star
    public void draw(Graphics g)
    {
        if(visible) {
            g.setColor(Color.WHITE);
            size = 100;
            g.fillOval(xcenter - size / 2, ycenter - size / 2, size, size);
        }
    }
}
