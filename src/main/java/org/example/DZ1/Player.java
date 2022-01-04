package org.example.DZ1;

public interface Player extends Runnable, Jumpable, Action {

    @Override
    int jump();

    @Override
    int run();
//
//    @Override
//    int getHeightJump();
//
//    @Override
//    int getLengthTreadMill();
}

