package Game.Movements;

import ch.aplu.turtle.*;
import java.awt.event.*;

/**
 *
 * @author fnitschmann
 */
public class ForwardMovements {
    //The local turtle
    private Turtle turtle;
    
    //Constructor and function
    public ForwardMovements(Turtle t) {
        //Set local turtle
        this.turtle = t;
        //Check if angle is 0 degrees
        if(this.turtle.heading() == 0) {
            this.turtle.addKeyListener(new KeyAdapter() {
                //Check if any key was pressed 
                public void keyPressed(KeyEvent evt) {
                    int step = 10; 
                    int keyCode = evt.getKeyCode();
                    turtle.penUp();
                    //Check if any arrow-key is pressed 
                    switch(keyCode) {
                        case KeyEvent.VK_UP:
                            turtle.setHeading(0);
                            turtle.forward(step);
                            break;
                    }
                }
            });
        }
    }
    
 }
