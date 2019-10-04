package com.CodeWithScott;

public class Mustang extends Vehicle {


    @Override
    public Boolean accelerateVehicle() {
        return true;
    }

    @Override
    public String getVehicleColor() {
        return "Green";
    }

    public int shiftGear() {
        return 5;
    }
}
