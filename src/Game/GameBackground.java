package Game;

import ch.aplu.turtle.*;
import java.awt.Color;
/**
 *
 * @author fnitschmann
 */
public class GameBackground {
    //The game background
    public TurtleFrame background = new TurtleFrame();
    
    //Constructor
    public GameBackground(int width, int height) {
        if(width > 0 && height > 0) {
            this.background.setSize(width, height);
        }
        //Make window resizable 
        this.background.setResizable(true);
        
    }
    //Set the title of the window 
    public void setWindowTitle(String title) {
        this.background.setTitle(title);
    }
}
