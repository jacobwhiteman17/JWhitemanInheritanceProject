package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player extends GameEntity {
    private String weaponName;
    private int weaponDamage;
    private int damageValue;
    private int armor;
    private List<String> entireFile;
    private ArrayList<String> weaponList;
    private ArrayList<String> damageListStrings;
    private ArrayList<Integer> damageList;//All my instance variables

    public Player() throws IOException {
        weaponList = new ArrayList<String>();
        damageListStrings = new ArrayList<String>();
        damageList = new ArrayList<Integer>();

        entireFile = Files.readAllLines(Paths.get("src/com/company/weapons.txt"));
        for (String i: entireFile ){
            var midSplit = i.split("-");
            weaponName = midSplit[0];
            weaponList.add(weaponName);
            var damage = Integer.parseInt(midSplit[1]);
            damageList.add(damage);
            damageListStrings.add(midSplit[1]);
        }
    }

    public void swapWeapon(){
        Scanner input = new Scanner(System.in);
        System.out.println(weaponList.toString());
        System.out.println("Pick a weapon");
        var choice = input.nextLine();
        if (weaponList.contains(choice)){

            damageValue = damageList.get(weaponList.indexOf(choice));
        }
            else
                System.out.println("Not there");
        //}
    }

    public void changeArmor(int newArmorValue){
        armor = newArmorValue;
    }

    public int getArmor(){
        return armor;
    }

    public void takeDamage(int amount){
        int reducedDamage = (armor/1000) * amount;
        super.takeDamage(reducedDamage);
    }

    public int attack(BadGuy enemy){
        enemy.takeDamage(damageValue);
        return damageValue;
    }

    public String toString(){
        String hey = "Player " + super.toString();
        return hey;
    }
}
