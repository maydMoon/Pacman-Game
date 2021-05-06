
package pacmangame.entity.ghost;

import javax.swing.ImageIcon;
import pacmangame.GameEngine;
import pacmangame.Map;
import pacmangame.entity.Pacman;


public class Blinky extends Ghost {
    
    public Blinky(int y, int x) {
        super(y, x);
        this.canOut = true;
        loadImagesPrivate();
    }
    
    
    private void loadImagesPrivate () {
        
        ghostImage[0] = new ImageIcon(getClass().getResource("/images/Ghost/Blinky/blinky_default.gif")).getImage(); //stand by
        ghostImage[1] = new ImageIcon(getClass().getResource("/images/Ghost/Blinky/blinky_right.gif")).getImage();
        ghostImage[2] = new ImageIcon(getClass().getResource("/images/Ghost/Blinky/blinky_left.gif")).getImage();
        ghostImage[3] = new ImageIcon(getClass().getResource("/images/Ghost/Blinky/blinky_up.gif")).getImage();
        ghostImage[4] = new ImageIcon(getClass().getResource("/images/Ghost/Blinky/blinky_down.gif")).getImage();
    }
    
    @Override
    public void chaseMode (Map map, Pacman pacman) {
        this.targetY = pacman.getY() / GameEngine.TILE_SIZE;
        this.targetX = pacman.getX() / GameEngine.TILE_SIZE;
        
    }
    
}
