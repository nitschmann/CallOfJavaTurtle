package Game.Movements;

import ch.aplu.turtle.*;
import java.awt.event.*;
/**
 *
 * @author fnitschmann
 */
public class Movements {
    //The moveable Turtle 
    private Turtle turtle;
    
    //Add basic movements to a specific turtle
    public void makeFigureMovable(Turtle t) {
        //Initialize the given turtle 
        this.turtle = t; 
        //Implement movents on the given turtle
        new ForwardMovements(this.turtle);
        new RotationMovements(this.turtle);
    }
}
