package com.company;
import java.awt.Rectangle;

public class GameEntity {
    private Rectangle rect;
    private int health;

    public boolean doesCollide(GameEntity other){
        if (this.rect.intersects(other.rect))
            return true;//never used, but this is how i did it
        return false;
    }

    public void takeDamage(int amount){
        System.out.println(amount);
        health-=amount;//updates health
    }

    public String toString(){
        var info = " Health: " + health;
        return info;

    }
}
