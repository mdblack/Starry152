//main class
//this will open a window showing a randomly generated night sky full of stars

import javax.swing.*;
import java.awt.*;

public class Sky
{
    public static final int WIDTH=1300,HEIGHT=800;

    //global storage for program: 100 stars
    public static Star[] star;

    //object to draw stuff
    public static SkyComponent skycomponent;

    public static void main(String[] args)
    {
        //constructs all of the storage: 100 stars

        //make an array of 100 stars
        star=new Star[100];
        //go through and construct all 100 stars
        for(int i=0; i<100; i=i+1)
        {
            star[i]=new Star();
        }
        star[50]=new Moon();

        //now that we have our stars, make the window

        //make a window
        JFrame window=new JFrame("Night sky");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WIDTH,HEIGHT);

        //make a skycomponent and add it to the window
        skycomponent=new SkyComponent();
        window.add(skycomponent);

        //attach a mouse listener to my skycomponent
        SkyMouse mouselistener;
        mouselistener=new SkyMouse();
        skycomponent.addMouseListener(mouselistener);

        //make window visible
        window.setVisible(true);
    }
}
