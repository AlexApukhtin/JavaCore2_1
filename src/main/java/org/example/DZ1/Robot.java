package org.example.DZ1;

import java.util.Scanner;

public class Robot implements Player, Action{

    private int jumpR;
    private int runR;

//    public Robot(int runR, int jumpR){
//        this.runR= runR;
//        this.jumpR= jumpR;
//    }

    @Override
    public int getHeightJump() {
        jumpR= 30;
        return jumpR;
    }

    @Override
    public int getLengthTreadMill() {
        runR=1500;
        return runR;
    }

    @Override
    public int jump() {
        Scanner sc = new Scanner(System.in);
        jumpR = sc.nextInt();
        System.out.println("Робот может подпрыгнуть на "+ jumpR+ " см");
        return jumpR;
        //System.out.print(jumpR + ", ");
    }

    @Override
    public int run() {
        //System.out.print("Робот может пробежать ");
        Scanner sc = new Scanner(System.in);
        runR = sc.nextInt();
        System.out.println("Робот может пробежать "+ runR+ " м");
        return runR;
        //System.out.println(runR);
    }
}

