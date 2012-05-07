package Game.Actions;

import ch.aplu.turtle.*;
import java.awt.event.*;
import java.awt.Color;

/**
 *
 * @author fnitschmann
 */
public class Shots {
    //The shooter var
    private Turtle shooter;
    
    //Constructor
    public Shots(Turtle t) {
        //Initialize shooter
        this.shooter = t;
        //Check key
        this.shooter.addKeyListener(new KeyAdapter() {
                //Check if any key was pressed 
                public void keyPressed(KeyEvent evt) {
                    int keyCode = evt.getKeyCode();
                    //Check if space was pressed 
                    switch(keyCode) {
                        case KeyEvent.VK_SPACE:
                            newShot();
                        break;
                    }
                }
        });
    }
    
    private void newShot() {
        this.turnStraightForward();
        //Shot vars 
        TurtleFrame gameBackground = this.shooter.getFrame();
        int yMax = (int)(gameBackground.getHeight())+50;
        double x = this.shooter.getX();
        double y = (this.shooter.getY())+15;
        
        //the shot
        Turtle shot = new Turtle(gameBackground);
        shot.setPos(x, y);
        shot.setColor(Color.red);
        //let the shot run
        for(int i = 1; i <= 10; i++){
            shot.forward(10);
        }
        
    }
    
    private void turnStraightForward() {
        if(this.shooter.heading() != 0) this.shooter.heading(0);
    }
}
