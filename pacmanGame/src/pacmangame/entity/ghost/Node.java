
package pacmangame.entity.ghost;

//this auxiliary class the path finder of ghost
public class Node {
    private int x;
    private int y;
    
    public Node (int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    
}
