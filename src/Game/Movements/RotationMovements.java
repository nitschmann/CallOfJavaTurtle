package Game.Movements;

import ch.aplu.turtle.*;
import java.awt.event.*;

/**
 *
 * @author fnitschmann
 */
public class RotationMovements {
    
    private Turtle turtle; 
    
    //Constructor and function
    public RotationMovements(Turtle t) {
        //Set local turtle
        this.turtle = t; 
        //Eventlistener
        this.turtle.addKeyListener(new KeyAdapter() {
            //Check if any key was pressed 
            public void keyPressed(KeyEvent evt) {
                int step = 10; 
                int keyCode = evt.getKeyCode();
                turtle.penUp();
                //Check if any arrow-key is pressed 
                switch(keyCode) {
                    case KeyEvent.VK_LEFT: 
                        turtle.setHeading(-90);
                        //turtle.setX((turtle.getX()-step));
                        turtle.forward(step);
                        break;
                    case KeyEvent.VK_RIGHT:
                        turtle.setHeading(90);
                        //turtle.setX((turtle.getX()+step));
                        turtle.forward(step);
                        break;
                    case KeyEvent.VK_UP:
                        turtle.setHeading(0);
                        //turtle.setY((turtle.getY()+step));
                        turtle.forward(step);
                        break;
                    case KeyEvent.VK_DOWN:
                        turtle.setHeading(180);
                        //turtle.setY((turtle.getY()-step));
                        turtle.forward(step);
                        break;
                }
            }
        });
    }
    
}
