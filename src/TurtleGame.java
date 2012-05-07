
/**
 *
 * @author fnitschmann
 */

//Imports
import ch.aplu.turtle.*;
import java.awt.*;
import java.awt.event.*;

public class TurtleGame {
    
    private Turtle t = new Turtle();
    
    public TurtleGame() {
        //MouseAdapter
        this.t.addMouseListener(new MouseAdapter() {
           public void mousePressed(MouseEvent e) {
               t.setScreenPos(e.getPoint());
           }
        });
        //Events:
        this.t.beep();
    }
    
    public static void main(String[] args){
        new TurtleGame();
    }
}
