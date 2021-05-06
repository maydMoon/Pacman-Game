
package pacmangame.entity.ghost;

import pacmangame.entity.ghost.Ghost;
import javax.swing.ImageIcon;
import pacmangame.GameEngine;
import pacmangame.Map;
import pacmangame.entity.Pacman;

public class Inky extends Ghost {
    
    public Inky(int y, int x) {
        super(y, x);
        loadImagesPrivate();
    }
    
    
    //@Override
    private void loadImagesPrivate () {
        ghostImage[0] = new ImageIcon(getClass().getResource("/images/Ghost/Inky/inky_default.gif")).getImage(); //stand by
        ghostImage[1] = new ImageIcon(getClass().getResource("/images/Ghost/Inky/inky_right.gif")).getImage();
        ghostImage[2] = new ImageIcon(getClass().getResource("/images/Ghost/Inky/inky_left.gif")).getImage();
        ghostImage[3] = new ImageIcon(getClass().getResource("/images/Ghost/Inky/inky_up.gif")).getImage();
        ghostImage[4] = new ImageIcon(getClass().getResource("/images/Ghost/Inky/inky_down.gif")).getImage();
    }
    
    @Override
    public void chaseMode (Map map, Pacman pacman) {

       int y, x;
        if (pacman.getDirection().equals("up")) {
            y = (pacman.getY() / GameEngine.TILE_SIZE) - 2;
            x = (pacman.getX() / GameEngine.TILE_SIZE) - 2;  
        }else if (pacman.getDirection().equals("down")) {
            y = (pacman.getY() / GameEngine.TILE_SIZE) + 2;
            x = (pacman.getX() / GameEngine.TILE_SIZE);
        }else if (pacman.getDirection().equals("right")) {
            y = (pacman.getY() / GameEngine.TILE_SIZE);
            x = (pacman.getX() / GameEngine.TILE_SIZE) + 2;
        }else if (pacman.getDirection().equals("left")) {
            y = (pacman.getY() / GameEngine.TILE_SIZE);
            x = (pacman.getX() / GameEngine.TILE_SIZE) - 2;
        }else {
            y = (pacman.getY() / GameEngine.TILE_SIZE);
            x = (pacman.getX() / GameEngine.TILE_SIZE);
        }
        
        if (x > 0 && x < GameEngine.MAZE_SIZE_X && y > 0 && y < GameEngine.MAZE_SIZE_Y 
            &&(map.screenData[y * GameEngine.MAZE_SIZE_X + x] == 0 
            || map.screenData[y * GameEngine.MAZE_SIZE_X + x] == 1
            || map.screenData[y * GameEngine.MAZE_SIZE_X + x] == 63
            || map.screenData[y * GameEngine.MAZE_SIZE_X + x] == 64)) {
            this.targetY = y;
            this.targetX = x;
        }
        
        
    }   
        
        
    
    
}
