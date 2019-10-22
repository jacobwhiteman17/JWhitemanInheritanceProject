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
            System.out.println("Do you want to play? (Type Y if so)");
            var answer = input.nextLine();
            input.nextLine();
            if(answer.toUpperCase().equals("Y")){
                System.out.println("What is your armor value?");
                var armorRating = input.nextInt();
                myPlayer.changeArmor(armorRating);
                System.out.println("Okay your armor value has been changed");
                myPlayer.swapWeapon();//finish this
                System.out.println("Swapped");
                myBadGuy.attackClose(myPlayer);
                myPlayer.attack(myBadGuy);
                System.out.println(myPlayer.toString());
                System.out.println(myBadGuy.toString());
                System.out.println(myBoss.toString());
                myPlayer.attack(myBoss);
                myBoss.attackFromFar(myPlayer);
                System.out.println(myPlayer.toString());
                System.out.println(myBoss.toString());
                System.out.println(myBadGuy.toString());
            }
            else{
            break;
            }
        }
    }
}
