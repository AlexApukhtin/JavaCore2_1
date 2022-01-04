package org.example.DZ1;

import java.util.Random;
import java.util.Scanner;

public class Cat implements Player, Action{

    private int jumpC;
    private int runC;

//    public Cat(int runC, int jumpC){
//        this.runC= runC;
//        this.jumpC= jumpC;
//    }

    @Override
    public int jump() {
        Scanner sc = new Scanner(System.in);
        jumpC = sc.nextInt();
        System.out.println("Кот может подпрыгнуть на "+ jumpC + " см");
        return jumpC;
        //System.out.print(jumpC + ", ");
    }

    @Override
    public int run() {
        Scanner sc = new Scanner(System.in);
        runC = sc.nextInt();
        System.out.println("Кот может пробежать " + runC + " м");
        return runC;
    }

    @Override
    public int getHeightJump() {
        Random rnd = new Random();
        this.jumpC = rnd.nextInt(40) + 50;
        return jumpC;
    }

    @Override
    public int getLengthTreadMill() {
        Random rnd = new Random();
        this.runC = rnd.nextInt(2000) + 500;
        return runC;
    }
}

