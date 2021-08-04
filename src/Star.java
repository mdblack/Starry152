import java.awt.*;

public class Star
{
    //make a single star
    // what variables?
    //  center point x,y
    //  size of lines
    //  horizontal, vertical, forward slash, backslash
    //  color
    protected int xcenter, ycenter;
    protected int size;
    protected Color starcolor;
    protected boolean visible;

    //constructor: called from main, makes the star
    public Star()
    {
        //set variables to random values
        //make the star at beginning of program
        //xcenter to be a random number from 0 .. Sky.WIDTH
        //Math.random:  0.0-0.99999
        //multiply by width:   0.0 - 1299.999
        //cast to integer:  0 - 1299
        xcenter = (int) (Math.random() * Sky.WIDTH);
        ycenter = (int) (Math.random() * Sky.HEIGHT);
        //size  random humber 5..60
        //Math.random:  0.0-0.9999
        //multiply by the range  (60-5):  0.0-54.9999
        //add on the bottom of range 5:  5.0-59.9999
        //cast to integer: 5-59
        size = (int) (Math.random() * 55 + 5);
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        starcolor = new Color(red, green, blue);

        visible=true;
    }

    public boolean wasClicked(int mousex, int mousey)
    {
        //look at star's xcenter,ycenter,size
        if(mousex>=xcenter-size && mousex<=xcenter+size && mousey>=ycenter-size && mousey<=ycenter+size)
        {
            //star was clicked
            return true;
        }
        else
        {
            return false;
        }
    }

    //called when painting star
    //  shows the star, based on values calculated earlier
    public void draw(Graphics g)
    {
        //only draw if visible
        if(visible) {
            //drawing stuff in sky component
            g.setColor(starcolor);
            //forward slash
            g.drawLine(xcenter - size / 2, ycenter + size / 2, xcenter + size / 2, ycenter - size / 2);
            //back slash
            g.drawLine(xcenter - size / 2, ycenter - size / 2, xcenter + size / 2, ycenter + size / 2);
            //horizontal
            g.drawLine(xcenter - size / 2, ycenter, xcenter + size / 2, ycenter);
            //vertical
            g.drawLine(xcenter, ycenter + size / 2, xcenter, ycenter - size / 2);

        }
    }

    public void disappear()
    {
        visible=false;
    }
}
