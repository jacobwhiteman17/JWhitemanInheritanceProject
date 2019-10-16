package com.company;

public class BadGuy extends GameEntity {
    private int closeUpDamage;
    private int distanceDamage;

    public BadGuy(){
        closeUpDamage = 125;
        distanceDamage = 125;
    }

    public int attackClose(GameEntity victim){
        var damage = victim.takeDamage(closeUpDamage);
        return damage;
    }

    public int attackFromFar(GameEntity victim){
        var damage = victim.takeDamage(distanceDamage);
        return damage;
    }

    public String toString(){
        String hey = super.toString();
        return hey;
    }
}
