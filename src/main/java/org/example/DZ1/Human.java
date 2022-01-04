package org.example.DZ1;

import java.util.Random;
import java.util.Scanner;

public class Human implements Player,Action{
    private int runH;
    private int jumpH;

//    public Human(int runH, int jumpH){
//        this.runH= runH;
//        this.jumpH= jumpH;
//    }

    @Override
    public int jump() {
        Scanner sc = new Scanner(System.in);
        jumpH = sc.nextInt();
        System.out.println("Человек может подпрыгнуть на "+ jumpH+ " см");
        return jumpH;
    }

    @Override
    public int run() {
        Scanner sc = new Scanner(System.in);
        runH = sc.nextInt();
        System.out.println("Человек может пробежать "+ runH + " м");
        return runH;
    }

    @Override
    public int getHeightJump() {
        Random rnd = new Random();
        this.jumpH = rnd.nextInt(100) + 50;
        return jumpH;
    }

    @Override
    public int getLengthTreadMill() {
        Random rnd = new Random();
        this.runH = rnd.nextInt(900) + 100;
        return runH;
    }
}

