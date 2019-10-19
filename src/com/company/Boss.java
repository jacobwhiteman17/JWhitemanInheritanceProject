package com.company;

import java.util.Random;

public class Boss extends BadGuy{
    private int specialDamage1;
    private int specialDamage2;
    private int specialDamage3;
    private Random rand;

    public Boss(){
        specialDamage1 = 200;
        specialDamage2 = 250;
        specialDamage3 = 300;
    }

    public int attackClose(GameEntity victim){
        var bossAttack = chooseSpecialAttack();
        var attack = victim.takeDamage(bossAttack);
        return attack;
    }

    public int chooseSpecialAttack(){
        int randNum = rand.nextInt(3)+1;
        if (randNum == 1)
            randNum = specialDamage1;
        if (randNum == 2)
            randNum = specialDamage2;
        if (randNum == 3)
            randNum = specialDamage3;
        return randNum;
    }
}
