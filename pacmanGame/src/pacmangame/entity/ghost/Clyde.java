
package pacmangame.entity.ghost;

import pacmangame.entity.ghost.Ghost;
import javax.swing.ImageIcon;
import pacmangame.GameEngine;
import pacmangame.Map;
import pacmangame.entity.Pacman;


public class Clyde extends Ghost {
    
    public Clyde(int y, int x) {
        super(y, x);
        loadImagesPrivate();
    }
    
        private void loadImagesPrivate () {
        ghostImage[0] = new ImageIcon(getClass().getResource("/images/Ghost/Clyde/clyde_default.gif")).getImage(); //stand by
        ghostImage[1] = new ImageIcon(getClass().getResource("/images/Ghost/Clyde/clyde_right.gif")).getImage();
        ghostImage[2] = new ImageIcon(getClass().getResource("/images/Ghost/Clyde/clyde_left.gif")).getImage();
        ghostImage[3] = new ImageIcon(getClass().getResource("/images/Ghost/Clyde/clyde_up.gif")).getImage();
        ghostImage[4] = new ImageIcon(getClass().getResource("/images/Ghost/Clyde/clyde_down.gif")).getImage();
    }
    
    @Override
    public void chaseMode (Map map, Pacman pacman) {

       double distance = Math.sqrt(Math.pow(pacman.getY()/ GameEngine.TILE_SIZE - this.y / GameEngine.TILE_SIZE, 2) 
                              + Math.pow(pacman.getX()/ GameEngine.TILE_SIZE  - this.x / GameEngine.TILE_SIZE, 2));
       
       if (distance > 8) {
           this.targetY = pacman.getY() / GameEngine.TILE_SIZE;
           this.targetX = pacman.getX() / GameEngine.TILE_SIZE;
       }else {
           this.randomPosition(map, pacman,GameEngine.MAZE_SIZE_Y-1, 1, GameEngine.MAZE_SIZE_X-1, 1);
       } 
        
    }  
    
}
