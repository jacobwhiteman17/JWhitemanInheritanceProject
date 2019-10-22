package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player extends GameEntity {
    private String weaponName;
    private int damageValue;//weaponDamage in diagram
    private int armor;
    private List<String> entireFile;
    private ArrayList<String> weaponList;
    private ArrayList<String> damageListStrings;
    private ArrayList<Integer> damageList;//All my instance variables

    public Player() throws IOException {
        weaponList = new ArrayList<String>();
        damageListStrings = new ArrayList<String>();
        damageList = new ArrayList<Integer>();//creating lists
        entireFile = Files.readAllLines(Paths.get("src/com/company/weapons.txt"));
        for (String i: entireFile ){
            var midSplit = i.split("-");//splitting list by -
            weaponName = midSplit[0];
            weaponList.add(weaponName);//add first part
            var damage = Integer.parseInt(midSplit[1]);
            damageList.add(damage);
            damageListStrings.add(midSplit[1]);//add second part
        }
    }

    public void swapWeapon(){
        Scanner input = new Scanner(System.in);
        System.out.println(weaponList.toString());
        System.out.println("Pick a weapon");
        var choice = input.nextLine();
        if (weaponList.contains(choice)){//this is getting the correct damage value
            damageValue = damageList.get(weaponList.indexOf(choice));
        }
            else
                System.out.println("Not there");
    }
    public void changeArmor(int newArmorValue){
        armor = newArmorValue;
    }

    public int getArmor(){
        return armor;
    }

    public void takeDamage(int amount) {
        int reducedDamage = armor;
        if (armor / 1000 == 0) {//if armor is too low, don't block
            reducedDamage = amount;
        } else {
            reducedDamage = (armor / 1000) * amount;//update armor
        }
            super.takeDamage(reducedDamage);
    }

    public int attack(BadGuy enemy){
        enemy.takeDamage(damageValue);//enemy takes damage
        return damageValue;
    }

    public String toString(){
        String hey = "Player " + super.toString();//toString fun
        return hey;
    }
}
