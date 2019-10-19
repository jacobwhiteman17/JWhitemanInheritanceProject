package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Player extends GameEntity {
    private String weaponName;
    private int weaponDamage;
    private int damageValue;
    private int armor;
    private String[] weaponList;
    private Scanner input;

    public Player() throws IOException {
        var file = Files.readString(Paths.get("weapons.txt"));
        weaponList = file.split(" ");

    }

    public void swapWeapon(){
        System.out.println(Arrays.toString(weaponList));
        System.out.println("Pick a weapon");
        //var choice = input.nextLine();
        if (choice == weaponList)//finish later
    }

    public void changeArmor(int newArmorValue){
        armor = newArmorValue;
    }

    public int getArmor(){
        return armor;
    }

    public float takeDamage(){
        var reducedDamage = armor/1000;
        var q = super.takeDamage(reducedDamage);
        return q;
    }

    public int attack(BadGuy enemy){
        var ouch = enemy.takeDamage(damageValue);
        return ouch;
    }

    public String toString(){
        String hey = super.toString();
        return hey;
    }
}
