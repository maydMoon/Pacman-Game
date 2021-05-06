
package pacmangame.entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import pacmangame.GameEngine;
import pacmangame.Map;


public class Pacman extends Entity {
    private Image [] pacmanImage;
    private int pacmanImageIdx; //idx of array of images
    private boolean isDead;
    
    
    //constructor
    public Pacman (int y, int x) {
        this.y = y * GameEngine.TILE_SIZE;
        this.x = x * GameEngine.TILE_SIZE;
        this.hitbox = new Rectangle (this.x, this.y, GameEngine.TILE_SIZE,GameEngine.TILE_SIZE);
        this.velocity = 2;
        this.direction = "none";
        this.nextDirection = "none";
        this.pacmanImageIdx = 0;
        this.isDead = false;
        pacmanImage = new Image[7];
        
        loadImages();
        
    }
    
    @Override
    protected void loadImages() {
        pacmanImage[0] = new ImageIcon(getClass().getResource("/images/pacman/pacman.gif")).getImage();
        pacmanImage[0] = new ImageIcon(getClass().getResource("/images/pacman/pacman.gif")).getImage(); //stand by
        //pacmanImage[1] = new ImageIcon(getClass().getResource("/images/pacman/pacman_dying.gif")).getImage();
        pacmanImage[2] = new ImageIcon(getClass().getResource("/images/pacman/pacman_right.gif")).getImage();
        pacmanImage[3] = new ImageIcon(getClass().getResource("/images/pacman/pacman_left.gif")).getImage();
        pacmanImage[4] = new ImageIcon(getClass().getResource("/images/pacman/pacman_up.gif")).getImage();
        pacmanImage[5] = new ImageIcon(getClass().getResource("/images/pacman/pacman_down.gif")).getImage();
        pacmanImage[6] = new ImageIcon(getClass().getResource("/images/pacman/pacman_dead.gif")).getImage();
    }
 
    public void updateMovement(Map map) {
        //verifica se a mudanca de direcao eh valida
      if(this.x %GameEngine.TILE_SIZE == 0 && this.y % GameEngine.TILE_SIZE == 0 && !this.nextDirection.equals(this.direction)){
             //int pos = (this.x + (GameEngine.TILE_SIZE * this.reqX)) /GameEngine.TILE_SIZE + GameEngine.MAZE_SIZE_X * (int)((this.y+ (GameEngine.TILE_SIZE * this.reqY))/GameEngine.TILE_SIZE);
             int pos = (this.y+ (GameEngine.TILE_SIZE * this.reqY))/GameEngine.TILE_SIZE * GameEngine.MAZE_SIZE_X + ((this.x + (GameEngine.TILE_SIZE * this.reqX)) /GameEngine.TILE_SIZE);

             //System.out.println((map.isHome(((this.x + (GameEngine.TILE_SIZE * this.reqX)) /GameEngine.TILE_SIZE), ((this.y+ (GameEngine.TILE_SIZE * this.reqY))/GameEngine.TILE_SIZE))));
             if(map.screenData[pos] == 0 || map.screenData[pos]== 63 || map.screenData[pos] == 64) {
                   this.direction = this.nextDirection;
                   //this.nextDirection = "none";
             }//else this.nextDirection = "none";
             
      }
          //determina a proxima direcao do pacman
          switch (this.direction) {
                    case "up" -> {
                        this.dx = 0;
                        this.dy = -1;
                        this.pacmanImageIdx = 4;
            }
                    case "down" -> {
                        this.dx = 0;
                        this.dy = 1;
                        this.pacmanImageIdx = 5;
            }
                    case "right" -> {
                        this.dx = 1;
                        this.dy = 0;
                        this.pacmanImageIdx = 2;
            }
                    case "left" -> {
                        this.dx = -1;
                        this.dy = 0;
                        this.pacmanImageIdx = 3;
            }
                    default -> {
                        this.direction = "none";
                        this.dx = 0;
                        this.dy = 0;
                        this.pacmanImageIdx = 0;
            }
                }
              
              //faz com q o pacman ande de acordo coma  velocidade
              this.x+=this.dx * velocity;
              this.y+=this.dy * velocity;
              
              //checa se a proxima posicao é valida
              if(this.x%GameEngine.TILE_SIZE == 0 && this.y% GameEngine.TILE_SIZE ==0){
                  int pos = (this.x + (GameEngine.TILE_SIZE * this.dx)) /GameEngine.TILE_SIZE + GameEngine.TILE_SIZE * (int)((this.y+ (GameEngine.TILE_SIZE * this.dy))/GameEngine.TILE_SIZE);
                  //se nao for valida, a posicao é nula
                  if(map.screenData[pos] != 0 && map.screenData[pos] != 63 && map.screenData[pos] != 64)
                    this.direction = "none";
              }
              
          //update the hitbox    
         this.hitbox = new Rectangle (this.x + 5, this.y + 5, GameEngine.TILE_SIZE - 10 ,GameEngine.TILE_SIZE - 10);
              
    }
    
    @Override
    public void render(Graphics g) {
       if (!isDead) {
            g.drawImage(this.pacmanImage[this.pacmanImageIdx], this.x, this.y, null);
       }else {
           g.drawImage(this.pacmanImage[6], this.x, this.y, null);
       }
    }
    
    public void renderDeath(Graphics g) {
        g.drawImage(this.pacmanImage[6], this.x, this.y, null);
    }

    public boolean isDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }
     
}
