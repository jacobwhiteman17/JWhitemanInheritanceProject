package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) throws IOException {
        var myPlayer = new Player();
        var myBadGuy = new BadGuy();
        var myBoss = new Boss();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Do you want to play? (Type Y if so");
            var answer = input.nextLine();
            input.nextLine();
            if(answer.toUpperCase().equals("Y")){
                System.out.println("What is your armor value?");
                var armorRating = input.nextInt();
                myPlayer.changeArmor(armorRating);
                System.out.println("Okay your armor value has been changed");
                myPlayer.swapWeapon();//finish this
                myBadGuy.attackClose(myPlayer);
                myPlayer.attack(myBadGuy);
                myPlayer.toString();
                myBadGuy.toString();
                myBoss.toString();
                myPlayer.attack(myBoss);
                myBoss.attackFromFar(myPlayer);
                myPlayer.toString();
                myBoss.toString();
                myBadGuy.toString();
            }
            else{
            break;
            }
        }
    }
}
