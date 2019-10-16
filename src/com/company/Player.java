package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Player extends GameEntity {
    private String weaponName;
    private int weaponDamage;
    private int damageValue;
    private int armor;
    private String[] weaponList;

    public Player() throws IOException {
        var file = Files.readString(Paths.get("weapons.txt"));
        //weaponList = weapon;
        weaponList = file.split("\n");

    }

    public void swapWeapon(int newWeapon){
        System.out.println(Arrays.toString(weaponList));
        System.out.println("Pick a weapon");
        var input = new Scanner(System.in);
        var choice = input.nextLine();
        if (choice == weaponList)//finish later
    }

    public void changeArmor(int newArmorValue){
        armor = newArmorValue;
    }

    public int getArmor(){
        return armor;
    }

    public void takeDamage(){
        var reducedDamage = armor/1000;
        super.takeDamage(reducedDamage);//check this later
    }

    public int attack(BadGuy enemy){
        enemy.takeDamage();//fix
    }

    public String toString(){
        String hey = super.toString();
        return hey;
    }
}
