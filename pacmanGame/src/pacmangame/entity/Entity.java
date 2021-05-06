package pacmangame.entity;

import java.awt.Graphics;
import java.awt.Rectangle;

//this class is used as bluprint for pacman object (player) and enemies class (ghost)
public abstract class Entity {
    //the coordinates values of pixels in screen
    protected int x;
    protected int y;
    
    //variables the contais the next(uncertain)
    protected int reqX; 
    protected int reqY;
    
    //variables that decide the next position(for sure)
    protected int dx;
    protected int dy;
    
    protected int velocity;
    protected String direction; //current position
    protected String nextDirection; //the next position (able or not)
    
    public Rectangle hitbox; //variable for check colisions
    
    //basic constructor
    public Entity() {
    }

    protected abstract void loadImages ();
    public void updateMovement () {}
    public abstract void render (Graphics g);

    //getters and setters
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.nextDirection = direction;
    }

    
    public int getX() {
        return (int)x;
    }

    public void setX(int x) {
        this.x = x;
    }

    
    public int getY() {
        return (int)y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getReqX() {
        return reqX;
    }

    public void setReqX(int reqX) {
        this.reqX = reqX;
    }

    public int getReqY() {
        return reqY;
    }

    public void setReqY(int reqY) {
        this.reqY = reqY;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    
    
}

