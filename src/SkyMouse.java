import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//this class listens for certain mouse events
//implements requires 5 special methods
public class SkyMouse implements MouseListener
{
    //figure out which star was clicked and make it vanish
    public void mouseClicked(MouseEvent e) {
        //save where I clicked
        int mousex=e.getX();
        int mousey=e.getY();
        System.out.println("clicked "+mousex+","+mousey);

        //using coordinate, find what star was clicked
        //go through every star and ask were you clicked?
        for(int i=0; i<100; i=i+1)
        {
            if(Sky.star[i].wasClicked(mousex,mousey))
            {
                System.out.println("star "+i+" was clicked");
                //make star i disappear
                Sky.star[i].disappear();
            }
        }
        //force window to redraw
        Sky.skycomponent.repaint();
    }

    //ignore these because not using for this example
    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
