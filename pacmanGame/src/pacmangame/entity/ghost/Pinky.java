
package pacmangame.entity.ghost;

import javax.swing.ImageIcon;
import pacmangame.GameEngine;
import pacmangame.Map;
import pacmangame.entity.Pacman;


public class Pinky extends Ghost {
    
    public Pinky(int y, int x) {
        super(y, x);
        loadImagesPrivate ();
    }
    
        private void loadImagesPrivate () {
        ghostImage[0] = new ImageIcon(getClass().getResource("/images/Ghost/Pinky/pinky_default.gif")).getImage(); //stand by
        ghostImage[1] = new ImageIcon(getClass().getResource("/images/Ghost/Pinky/pinky_right.gif")).getImage();
        ghostImage[2] = new ImageIcon(getClass().getResource("/images/Ghost/Pinky/pinky_left.gif")).getImage();
        ghostImage[3] = new ImageIcon(getClass().getResource("/images/Ghost/Pinky/pinky_up.gif")).getImage();
        ghostImage[4] = new ImageIcon(getClass().getResource("/images/Ghost/Pinky/pinky_down.gif")).getImage();
    }
    
    @Override
    public void chaseMode (Map map, Pacman pacman) {

       int nextY, nextX;
        switch (pacman.getDirection()) {
            case "up" -> {
                nextY = (pacman.getY() / GameEngine.TILE_SIZE) - 4;
                nextX = (pacman.getX() / GameEngine.TILE_SIZE) - 4;
            }
            case "down" -> {
                nextY = (pacman.getY() / GameEngine.TILE_SIZE) + 4;
                nextX = (pacman.getX() / GameEngine.TILE_SIZE);
            }
            case "right" -> {
                nextY = (pacman.getY() / GameEngine.TILE_SIZE);
                nextX = (pacman.getX() / GameEngine.TILE_SIZE) + 4;
            }
            case "left" -> {
                nextY = (pacman.getY() / GameEngine.TILE_SIZE);
                nextX = (pacman.getX() / GameEngine.TILE_SIZE) - 4;
            }
            default -> {
                nextY = (pacman.getY() / GameEngine.TILE_SIZE);
                nextX = (pacman.getX() / GameEngine.TILE_SIZE);
            }
        }
        
        if (nextX > 0 && nextX < GameEngine.MAZE_SIZE_X && nextY > 0 && nextY < GameEngine.MAZE_SIZE_Y 
            &&(map.screenData[nextY * GameEngine.MAZE_SIZE_X + nextX] == 0 
            || map.screenData[nextY * GameEngine.MAZE_SIZE_X + nextX] == 1
            || map.screenData[nextY * GameEngine.MAZE_SIZE_X + nextX] == 63
            || map.screenData[nextY * GameEngine.MAZE_SIZE_X + nextX] == 64)) {
            this.targetY = nextY;
            this.targetX = nextX;
        }
        
        
    }
    
    
}
