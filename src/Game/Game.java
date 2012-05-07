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
        this.t = new Turtle();
        this.t.setPos(0, 0);
        this.t.speed(100);
        Movements m = new Movements();
        m.makeFigureMovable(this.t);
    }
    
    public static void main(String[] args) {
        new Game();
    }
}
