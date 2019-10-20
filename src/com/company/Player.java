package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Player extends GameEntity {
    private String weaponName;
    private int weaponDamage;
    private int damageValue;
    private int armor;
    private ArrayList<String> weaponList;
    private ArrayList<String> damageListStrings;
    private ArrayList<Integer> damageList;

    public Player() throws IOException {
        Scanner file = new Scanner(new File("weapons.txt"));
        while (file.hasNextLine()){
            weaponList.add(file.nextLine().split(" ")[0]);
            damageListStrings.add(file.nextLine().split(" ")[1]);
        }

        for (String i: damageListStrings){
            var values = Integer.parseInt(i);
            damageList.add(values);
        }

    }

    public void swapWeapon(){
        Scanner input = new Scanner(System.in);
        System.out.println(weaponList.size());
        System.out.println("Pick a weapon");
        var choice = input.nextLine();
        for (String choice:)//finish later
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
