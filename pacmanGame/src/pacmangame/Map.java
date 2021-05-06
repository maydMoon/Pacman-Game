
package pacmangame;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Map {
   private final int sizeX;
   private final int sizeY;
    
   
    private Image [] mapImages;
    
    
    private int map[];
    public int numPills; //number of pills in the maze
    public int screenData[]; //aux array of the map
    public int [][] ghostHome = {{9,13},{9,14},{9,15}};
    
    //constructor
    public Map() {
            this.sizeY = GameEngine.MAZE_SIZE_Y;//this is the map lenght in X coord
            this.sizeX = GameEngine.MAZE_SIZE_X; //this is the map lenght in X coord

               map = new int [] {
                   1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,10, 9,11, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3,
                    8,64,63,63,63,63,63,63,63,63,63,63,63,63,12,63,63,63,63,63,63,63,63,63,63,63,63,63,64, 4,
                    8,63,22,17,17,18,63,22,17,17,17,17,18,63,13,63,22,17,17,17,17,18,63,22,17,17,17,18,63, 4,
                    8,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63, 4,
                    8,63,22,26,29,30,18,63,63,63,27,63,22,26,29,30,18,63,28,17,18,63,22,26,29,30,17,18,63, 4,
                    8,63,63,63,31,63,63,63,63,63,45,63,63,63,31,63,63,63,33,63,63,63,63,63,31,63,63,63,63, 4,
                    8,63,27,63,12,63,28,17,32,63,44,46,18,63,13,63,22,36,34,63,27,63,27,63,13,63,28,18,63, 4,
                    8,63,12,63,12,63,12, 0,12,63,43, 0, 0, 0, 0, 0, 0, 0,35,63,12,63,12,63,63,63,42,32,63, 4,
                    8,63,12,63,12,63,45, 0,12,63,13, 0,53,54,55,56,57, 0,13,63,42,17,37,63,27,63,63,13,63, 4,
                    8,63,13,63,13,63,44,46,37,63,63, 0,62, 0, 0, 0,58, 0,63,63,63,63,63,63,44,32,63,63,63, 4,
                    8,63,63,63,63,63,43,63,63,63,27, 0,61,60,60,60,59, 0,27,63,28,17,18,63,43,42,32,63,63, 4,
                    8,63,22,32,63,63,13,63,27,63,12, 0, 0, 0, 0, 0, 0, 0,12,63,12,63,63,63,12,63,12,63,63, 4,
                    8,63,63,44,18,63,63,63,33,63,13,63,22,26,29,30,18,63,13,63,12,63,22,17,37,63,42,18,63, 4,
                    16,63,63,43,63,63,22,36,34,63,63,63,63,63,13,63,63,63,63,63,13,63,63,63,63,63,63,63,63,24,
                    14,18,63,12,63,63,63,63,42,18,63,27,63,63, 0,63,63,27,63,63,63,63,22,32,63,28,17,17,17,23,
                    15,63,63,42,18,63,27,63,63,63,63,12,63,22,29,18,63,12,63,27,63,63,63,12,63,12,63,63,63,25,
                    8,63,63,63,63,63,41,63,63,63,63,12,63,63,12,63,63,12,63,41,63,63,63,12,63,12,64,27,63, 4,
                    8,63,22,17,17,40,39,38,17,18,63,13,63,63,13,63,63,42,40,39,38,18,63,12,63,42,17,37,63, 4,
                    8,64,63,63,63,63,63,63,63,63,63,63,63,63,64,63,63,63,63,63,63,63,63,12,63,63,63,63,63, 4,
                    7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,21,19,20, 6, 6, 6, 6, 5,
               };
               
           
           
           
            screenData = new int [this.sizeX * this.sizeY];
            for(int i = 0; i < (this.sizeX * this.sizeY);i++) {
                screenData[i] = map[i];
                //checks the amount of pills 
                if (map[i] == 63 || map[i] == 64)
                    numPills++; //increase the number of pills
            }
            
            loadMapImages();
            
    }
    
    
    //this method load the image of map
    public void loadMapImages () {

        mapImages = new Image[65];
	
        mapImages[0] = new ImageIcon(getClass().getResource("/images/mapa/00.jpg")).getImage();
	mapImages[1] = new ImageIcon(getClass().getResource("/images/mapa/01.png")).getImage();
        mapImages[2] = new ImageIcon(getClass().getResource("/images/mapa/02.png")).getImage();
        mapImages[3] = new ImageIcon(getClass().getResource("/images/mapa/03.png")).getImage();
        mapImages[4] = new ImageIcon(getClass().getResource("/images/mapa/04.png")).getImage();
        mapImages[5] = new ImageIcon(getClass().getResource("/images/mapa/05.png")).getImage();
        mapImages[6] = new ImageIcon(getClass().getResource("/images/mapa/06.png")).getImage();
        mapImages[7] = new ImageIcon(getClass().getResource("/images/mapa/07.png")).getImage();
        mapImages[8] = new ImageIcon(getClass().getResource("/images/mapa/08.png")).getImage();
        mapImages[9] = new ImageIcon(getClass().getResource("/images/mapa/09.png")).getImage();
        mapImages[10] = new ImageIcon(getClass().getResource("/images/mapa/10.png")).getImage();
        mapImages[11] = new ImageIcon(getClass().getResource("/images/mapa/11.png")).getImage();
        mapImages[12] = new ImageIcon(getClass().getResource("/images/mapa/12.png")).getImage();
        mapImages[13] = new ImageIcon(getClass().getResource("/images/mapa/13.png")).getImage();
        mapImages[14] = new ImageIcon(getClass().getResource("/images/mapa/14.png")).getImage(); 
        mapImages[15] = new ImageIcon(getClass().getResource("/images/mapa/15.png")).getImage();
        mapImages[16] = new ImageIcon(getClass().getResource("/images/mapa/16.png")).getImage();
        mapImages[17] = new ImageIcon(getClass().getResource("/images/mapa/17.png")).getImage();
        mapImages[18] = new ImageIcon(getClass().getResource("/images/mapa/18.png")).getImage();
        mapImages[19] = new ImageIcon(getClass().getResource("/images/mapa/19.png")).getImage();
        mapImages[20] = new ImageIcon(getClass().getResource("/images/mapa/20.png")).getImage();
        mapImages[21] = new ImageIcon(getClass().getResource("/images/mapa/21.png")).getImage();
        mapImages[22] = new ImageIcon(getClass().getResource("/images/mapa/22.png")).getImage();
        mapImages[23] = new ImageIcon(getClass().getResource("/images/mapa/23.png")).getImage();
        mapImages[24] = new ImageIcon(getClass().getResource("/images/mapa/24.png")).getImage();
        mapImages[25] = new ImageIcon(getClass().getResource("/images/mapa/25.png")).getImage();
        mapImages[26] = new ImageIcon(getClass().getResource("/images/mapa/26.jpg")).getImage();
        mapImages[27] = new ImageIcon(getClass().getResource("/images/mapa/27.png")).getImage();
        mapImages[28] = new ImageIcon(getClass().getResource("/images/mapa/28.png")).getImage();
        mapImages[29] = new ImageIcon(getClass().getResource("/images/mapa/29.jpg")).getImage(); 
        mapImages[30] = new ImageIcon(getClass().getResource("/images/mapa/30.png")).getImage();
        mapImages[31] = new ImageIcon(getClass().getResource("/images/mapa/31.png")).getImage();
        mapImages[32] = new ImageIcon(getClass().getResource("/images/mapa/32.png")).getImage();
        mapImages[33] = new ImageIcon(getClass().getResource("/images/mapa/33.png")).getImage();
        mapImages[34] = new ImageIcon(getClass().getResource("/images/mapa/34.jpg")).getImage();
        mapImages[35] = new ImageIcon(getClass().getResource("/images/mapa/35.png")).getImage();
        mapImages[36] = new ImageIcon(getClass().getResource("/images/mapa/36.png")).getImage();
        mapImages[37] = new ImageIcon(getClass().getResource("/images/mapa/37.png")).getImage();
        mapImages[38] = new ImageIcon(getClass().getResource("/images/mapa/38.png")).getImage();
        mapImages[39] = new ImageIcon(getClass().getResource("/images/mapa/39.jpg")).getImage();
        mapImages[40] = new ImageIcon(getClass().getResource("/images/mapa/40.png")).getImage();
        mapImages[41] = new ImageIcon(getClass().getResource("/images/mapa/41.png")).getImage();
        mapImages[42] = new ImageIcon(getClass().getResource("/images/mapa/42.png")).getImage();
        mapImages[43] = new ImageIcon(getClass().getResource("/images/mapa/43.png")).getImage();
        mapImages[44] = new ImageIcon(getClass().getResource("/images/mapa/44.jpg")).getImage(); 
        mapImages[45] = new ImageIcon(getClass().getResource("/images/mapa/45.png")).getImage();
        mapImages[46] = new ImageIcon(getClass().getResource("/images/mapa/46.png")).getImage();
        mapImages[47] = new ImageIcon(getClass().getResource("/images/mapa/47.png")).getImage();
        mapImages[48] = new ImageIcon(getClass().getResource("/images/mapa/48.png")).getImage();
        mapImages[49] = new ImageIcon(getClass().getResource("/images/mapa/49.png")).getImage();
        mapImages[50] = new ImageIcon(getClass().getResource("/images/mapa/50.png")).getImage();
        mapImages[51] = new ImageIcon(getClass().getResource("/images/mapa/51.png")).getImage();
        mapImages[52] = new ImageIcon(getClass().getResource("/images/mapa/52.png")).getImage();
        mapImages[53] = new ImageIcon(getClass().getResource("/images/mapa/53.png")).getImage();
        mapImages[54] = new ImageIcon(getClass().getResource("/images/mapa/54.png")).getImage();
        mapImages[55] = new ImageIcon(getClass().getResource("/images/mapa/55.png")).getImage();
        mapImages[56] = new ImageIcon(getClass().getResource("/images/mapa/56.png")).getImage();
        mapImages[57] = new ImageIcon(getClass().getResource("/images/mapa/57.png")).getImage();
        mapImages[58] = new ImageIcon(getClass().getResource("/images/mapa/58.png")).getImage();
        mapImages[59] = new ImageIcon(getClass().getResource("/images/mapa/59.png")).getImage();       
        mapImages[60] = new ImageIcon(getClass().getResource("/images/mapa/60.png")).getImage();
        mapImages[61] = new ImageIcon(getClass().getResource("/images/mapa/61.png")).getImage();
        mapImages[62] = new ImageIcon(getClass().getResource("/images/mapa/62.png")).getImage();
	mapImages[63] = new ImageIcon(getClass().getResource("/images/mapa/63.gif")).getImage();
        mapImages[64] = new ImageIcon(getClass().getResource("/images/mapa/64.gif")).getImage();
               
        
    }
    
    
    
    public void drawMaze (Graphics g) {
        
        int i = 0;
        for (int y = 0; y < GameEngine.SCREEN_HEIGHT; y+= GameEngine.TILE_SIZE) { 
            for (int x = 0; x < GameEngine.SCREEN_WIDTH; x+= GameEngine.TILE_SIZE) {
                g.drawImage(mapImages[screenData[i]],x,y, null);
                i++;
            }
        }

        //draw the white clomuns and lines for debugg
      
       /* for (int y = 0; y < 20; y++) { 
            g.setColor(Color.white);
            //g.drawLine(y * TILE_SIZE, 0 , y * TILE_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, y * GameEngine.TILE_SIZE, GameEngine.SCREEN_WIDTH, y * GameEngine.TILE_SIZE);
            for (int x = 0; x < 30; x++) {
               // g.drawImage(mapImages[map[y][x]], x * TILE_SIZE,( y * TILE_SIZE), null);
                //g.drawLine(x * TILE_SIZE, 0 , x * TILE_SIZE, SCREEN_HEIGHT);
                g.drawLine(x * GameEngine.TILE_SIZE, 0 , x * GameEngine.TILE_SIZE, GameEngine.SCREEN_HEIGHT);
           
            }
        }*/
    }
    
    //verify if the the object-x,y is in map home
    public boolean isHome (int y, int x) {     
           for (int i = 0; i < this.ghostHome.length; i++) {
               if (y  == this.ghostHome[i][0] && x  == this.ghostHome[i][1]) {
                   return true;    
           }           
        }
                 
        return false;
    }
    

}
