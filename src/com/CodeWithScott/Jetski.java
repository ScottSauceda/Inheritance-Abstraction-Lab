package com.CodeWithScott;

public class Jetski implements Watercraft {


    @Override
    public Boolean canFloat() {
        return true;
    }

    @Override
    public int getCupHolders() {
        return 4;
    }

    public String doAFlip() {
       return "Heck Yeah Brother";
    }
}
