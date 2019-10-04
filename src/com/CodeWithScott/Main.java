package com.CodeWithScott;

public class Main {

    public static void main(String[] args) {

        Mustang mustang = new Mustang();
        System.out.println("Mustang");
        System.out.println("Accelerate: " + mustang.accelerateVehicle());
        System.out.println("Vehicle Color: " + mustang.getVehicleColor());
        System.out.println("Shift Gear: " + mustang.shiftGear());
        System.out.println("\n");

        Ninja ninja = new Ninja();
        System.out.println("Ninja");
        System.out.println("Accelerate: " + ninja.accelerateVehicle());
        System.out.println("Vehicle Color: " + ninja.getVehicleColor());
        System.out.println("Wheelie: " + ninja.wheelie());
        System.out.println("\n");

        Jetski jetski = new Jetski();
        System.out.println("Jetski");
        System.out.println("Can Float: " + jetski.canFloat());
        System.out.println("Get Num of Cup Holders: " + jetski.getCupHolders());
        System.out.println("Do a flip: " + jetski.doAFlip());

    }
}
