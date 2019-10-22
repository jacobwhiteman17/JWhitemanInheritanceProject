package com.company;

public class BadGuy extends GameEntity {
    private int closeUpDamage;
    private int distanceDamage;

    public BadGuy(){
        closeUpDamage = 125;
        distanceDamage = 125;
    }

    public int attackClose(GameEntity victim){
        victim.takeDamage(closeUpDamage);
        return closeUpDamage;//straight forward
    }

    public int attackFromFar(GameEntity victim){
        victim.takeDamage(distanceDamage);
        return distanceDamage;
    }

    public String toString(){
        String hey = "Bad Guy " + super.toString();
        return hey;
    }
}
