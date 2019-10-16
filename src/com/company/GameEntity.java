package com.company;
import java.awt.Rectangle;

public class GameEntity {
    private Rectangle rect;
    private int health;

    public boolean doesCollide(GameEntity other){
        if (this.rect.intersects(other)){
            return true;
        }
    }

    public void takeDamage(int amount){
        var getHit = health-amount;
    }

    public String toString(){
        var info = health;
        return info;

    }
}
