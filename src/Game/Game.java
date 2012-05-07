/**
 *
 * @author fnitschmann
 */

package Game;

//Imports
import ch.aplu.turtle.*;
import java.awt.*;
import java.awt.event.*;


public class Game {
    
    //Main vars
    private Turtle t;
    //Constructor
    public Game() {
        GameBackground background = new GameBackground(1000, 880);
        background.setWindowTitle("Call of Java Turtle");
        this.t = new Turtle(background.background);
        //this.tFrame.setResizable(false);
        /*this.t = new Turtle(this.tFrame);
        //MouseAdapter
        this.t.addMouseListener(new MouseAdapter() {
           public void mousePressed(MouseEvent e) {
               t.setScreenPos(e.getPoint());
           }
        });
        //Events:
        this.t.beep();
        //this.tFrame.setBackground(Color.yellow);
        */
    }
    
    public static void main(String[] args) {
        new Game();
    }
}
