package com.company;
import java.awt.Rectangle;

public class GameEntity {
    private Rectangle rect;
    private int health;

    public boolean doesCollide(GameEntity other){
        if (this.rect.intersects(other.rect))
            return true;
        return false;
    }

    public void takeDamage(int amount){
        var getHit = health-amount;
    }

    public String toString(){
        var info = "Entity: " +this.rect + " Health: " + this.health;//fix later
        return info;

    }
}
