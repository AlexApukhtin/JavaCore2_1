package org.example.DZ1;

public interface Action extends Wall, TreadMill {

    @Override
    int getLengthTreadMill();

    @Override
    int getHeightJump();
}
//@Override
