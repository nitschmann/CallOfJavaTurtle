/**
 *
 * @author fnitschmann
 */

package Game;

//Imports
import ch.aplu.turtle.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import Game.Movements.*; 

public class Game {
    
    //Main vars
    private Turtle t;
    //Constructor
    public Game() {
        /*GameBackground background = new GameBackground(1000, 880);
        background.setWindowTitle("Call of Java Turtle");
        background.setBackgroundColor(Color.red);*/
        this.t = new Turtle();
        this.t.setPos(0, 0);
        Movements m = new Movements();
        m.makeFigureMovable(this.t);
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
